package problem6;

public class SumSquareDifferenceCalculator {
    public static long calculateSumSquareDifference(final int limit){
        return Math.abs(squareOfSum(limit) - sumOfSquares(limit));
    }

    public static long sumOfSquares(final int limit){
        long product = 0;
        for(int i = 1; i < limit+1; i++){
            product += i*i;
        }
        return product;
    }

    public static long squareOfSum(final int limit){
        long sum = 0;
        for(int i = 1; i < limit+1; i++){
            sum += i;
        }
        return sum*sum;
    }
}
