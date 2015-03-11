package problem37;

import problem7.PrimeCalculator;

public class TruncatablePrimeCalculator {
    public static int sumOfTruncatablePrimes(int count){
        int sum = 0;
        for(int i = 11; count > 0; i += 2){
            if(isTruncatablePrime(i)){
                System.out.println(i);
                sum += i;
                count--;
            }
        }
        return sum;
    }

    public static boolean isTruncatablePrime(final int number) {
        int n = number;
        //Check right to left
        while(n > 0){
            if(PrimeCalculator.isPrime(n)){
                n /= 10;
            } else return false;
        }

        //Check left to right right
        int scale = 10;
        while(number / scale > 9){
            scale *= 10;
        }
        n = number;
        while(scale > 9){
            if(PrimeCalculator.isPrime(n % scale)){
                scale /= 10;
            } else return false;
        }

        return true;
    }
}
