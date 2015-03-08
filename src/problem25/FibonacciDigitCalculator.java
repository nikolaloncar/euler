package problem25;

import java.math.BigInteger;

public class FibonacciDigitCalculator {
    public static int fibonacciNumberWithMinDigits(int digits){
        if(digits == 1) return 1;
        BigInteger min = BigInteger.ONE;
        while(digits > 1){
            min = min.multiply(BigInteger.TEN);
            digits--;
        }
        BigInteger firstTerm = BigInteger.ONE;
        BigInteger secondTerm = BigInteger.ONE;
        BigInteger temp;
        int term = 2;
        while(secondTerm.compareTo(min) < 0){
            temp = firstTerm.add(secondTerm);
            firstTerm = secondTerm;
            secondTerm = temp;
            term++;
        }
        return term;
    }
}
