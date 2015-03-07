package problem16;

import java.math.BigInteger;

public class PowerDigitCalculator {
    public static long powerDigitSum(final int base, final int power){
        BigInteger number = BigInteger.valueOf(base).pow(power);
        long sum = 0;
        while(number.compareTo(BigInteger.ZERO) != 0){
            BigInteger[] result = number.divideAndRemainder(BigInteger.TEN);
            sum += result[1].longValue();
            number = result[0];
        }
        sum += number.longValue();
        return sum;
    }
}
