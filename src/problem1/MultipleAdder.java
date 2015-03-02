package problem1;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class MultipleAdder {
    //Using streams
    public static int streamSum(int limit, int[] multiples) {
        return Arrays.stream(multiples)
                .mapToObj(multiple -> sumOfMultiple(limit-1, multiple))
                .reduce(IntStream.empty(), IntStream::concat)
                .distinct()
                .sum();
    }

    private static IntStream sumOfMultiple(final int limit, final int multiple){
        final IntSupplier supplier = new IntSupplier() {
            int num = 0;
            @Override
            public int getAsInt() {
                num += multiple;
                return num;
            }
        };

        return IntStream.generate(supplier)
                .limit(limit / multiple);
    }

    //Mathematical approach
    public static int optimizedSum(int limit, int[] multiples){
        int sum = 0;
        int multipleSum = 0;
        for(int multiple : multiples){
            multipleSum += multiple;
            sum += sumDivBy(limit, multiple);
        }
        return sum - sumDivBy(limit, multipleSum);
    }

    private static int sumDivBy(final int limit, final int multiple){
        return limit*(multiple/limit)*((multiple/limit)+1)/2;
    }
}
