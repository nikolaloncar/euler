package problem12;

public class TriangularNumberCalculator {
    public static long numberWithMinDivisorCount(final int count){
        long triangleNumber = 0;
        int increment = 1;
        while(divisorCount(triangleNumber) < count){
            triangleNumber += increment;
            increment++;
        }
        return triangleNumber;
    }

    public static int divisorCount(final long number){
        int divisorCount = 0;
        double sqrt = Math.sqrt(number);
        for(int i = 1; i <= sqrt; i++){
            if(number % i == 0) divisorCount += 2;
        }
        if(sqrt*sqrt == number) divisorCount--;
        return divisorCount;
    }
}
