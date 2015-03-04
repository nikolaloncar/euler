package problem3;

public class PrimeFactorCalculator {
    public static long largestPrimeFactor(final long number){
        long lastFactor = 1;
        long n = number;
        for(long i = 2; i <= n; i++){
            while(n % i == 0) {
                lastFactor = i;
                n /= i;
            }
        }
        return lastFactor;
    }

    //I didn't do this bit.
    //This is borrowed from the Euler document and I am just using it for performance testing and understanding :)
    public static long fastPrimeFactor(final long number){
        long n = number;
        long lastFactor = -1;
        if(n == 2 || (n > 2 && (n & 1) == 0)) {
            while(n % 2 == 0){
                lastFactor = 2;
                n /= 2;
            }
        }
        long factor = 3;
        long maxFactor = (long) Math.sqrt(number);
        while(n > 1 && factor <= maxFactor){
            if(n % factor == 0){
                lastFactor = factor;
                maxFactor = (long) Math.sqrt(n);
                while(n % factor == 0) {
                    n /= factor;
                }
            }
            factor += 2;
        }
        if(n == 1) return lastFactor;
        else return n;
    }
}
