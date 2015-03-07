package problem20;

import java.math.BigInteger;

public class FactorialDigitSumCalculator {
    public static long factorialDigitSum(final int number){
        BigInteger factorial = BigInteger.ONE;
        for(int i = 2; i < number+1; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        long sum = 0;
        while(factorial.compareTo(BigInteger.ZERO) != 0){
            BigInteger[] result = factorial.divideAndRemainder(BigInteger.TEN);
            sum += result[1].longValue();
            factorial = result[0];
        }
        return sum;
    }
}
