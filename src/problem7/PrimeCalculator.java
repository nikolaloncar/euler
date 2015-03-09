package problem7;

public class PrimeCalculator {
    public static int primeAtIndex(final int index){
        if(index == 1) return 2;
        int count = index-1;
        int lastPrime = -1;
        for(int number = 3 ; count > 0; number += 2){
            if(isPrime(number)){
                lastPrime = number;
                count--;
            }
        }
        return lastPrime;
    }

    public static boolean isPrime(final int number){
        if(number == 1) return false;
        if(number > 2 && (number & 1) == 0) return false;
        for(int i = 3; i * i <= number; i += 2){
            if(number % i == 0) return false;
        }
        return true;
    }
}
