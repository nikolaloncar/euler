package problem13;

import java.math.BigInteger;

public class LargeNumberAdder {
    public static String addLargeNumbers(String... numbers){
        BigInteger bigInteger = BigInteger.ZERO;
        for(String number : numbers) {
            bigInteger = bigInteger.add(new BigInteger(number));
        }
        return bigInteger.toString();
    }
}
