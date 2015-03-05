package problem12;

public class TriangularNumberCalculator {
    public static long numberWithMinDivisorCount(final int count){
        if(count == 1) return 1;
        long triangleNumber = 3;
        int increment = 3;
        while(divisorCount(triangleNumber) < count){
            triangleNumber += increment;
            increment++;
        }
        return triangleNumber;
    }

    public static int divisorCount(final long number){
        int divisorCount = 1;
        for(int i = 1; i <= number/2; i++){
            if(number % i == 0) divisorCount++;
        }
        return divisorCount;
    }
}
