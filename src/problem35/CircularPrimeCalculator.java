package problem35;

import problem7.PrimeCalculator;

public class CircularPrimeCalculator {
    public static int circularPrimesBelow(final int limit){
        boolean[] checked = new boolean[limit];
        int sum = 1;
        for(int i = 3; i < limit; i += 2){
            if(!checked[i]){
                boolean isCircularPrime = isCircularPrime(i);
                int n = i;
                do {
                    if(n < limit) checked[n] = isCircularPrime;
                    if(isCircularPrime){
                        sum++;
                        n = shiftDigitsRight(n);
                    }
                } while(n != i);
            }
        }
        return sum;
    }

    public static boolean isCircularPrime(final int number){
        if(containsZero(number)) return false;
        int n = number;
        do{
            if(!PrimeCalculator.isPrime(n)) return false;
            n = shiftDigitsRight(n);
        }while(n != number);
        return true;
    }

    public static int shiftDigitsRight(final int number) {
        int n = number;
        int scale = 1;
        while(n > 9){
            n /= 10;
            scale *= 10;
        }
        return (number % 10)*scale + number / 10;
    }

    public static boolean containsZero(final int number){
        int t = number;
        while(t > 9){
            if(t % 10 == 0) return true;
            else t /= 10;
        }
        return false;
    }
}
