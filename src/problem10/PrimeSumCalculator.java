package problem10;

import problem7.PrimeCalculator;

public class PrimeSumCalculator {
    public static long sumOfPrimes(final int limit){
        long sum = 2;
        if(limit == 2) return sum;
        for(int number = 3 ; number < limit; number += 2){
            if(PrimeCalculator.isPrime(number)){ //A method to check if a number is prime was already done in problem 10.
                sum += number;
            }
        }
        return sum;
    }
}
