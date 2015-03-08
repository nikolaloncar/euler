package problem21;

public class AmicableNumberCalculator {
    public static long sumOfAmicableNumbers(final int limit){
        long sum = 0;
        for(int a = 1; a <= limit; a++){
            for(int b = a+1; b <= limit; b++){
                if(areAmicable(a, b)){
                    sum += a + b;
                }
            }
        }
        return sum;
    }

    public static boolean areAmicable(final int a, final int b){
        return a != b
                && divisorSum(a) == b
                && divisorSum(b) == a;
    }

    public static int divisorSum(final int number){
        int sum = 1;
        double sqrt = Math.sqrt(number);
        for(int i = 2; i <= sqrt; i++){
            if(number % i == 0){
                sum += i;
                sum += number/i;
            }
        }
        return sum;
    }
}
