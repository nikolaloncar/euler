package problem21;

public class AmicableNumberCalculator {
    public static long sumOfAmicableNumbers(final int limit){
        int[] divisorSums = new int[limit];
        for(int i = 0; i < limit; i++){
            divisorSums[i] = divisorSum(i+1);
        }
        int sum = 0;
        for(int a = 1; a <= limit; a++){
            for(int b = a+1; b <= limit; b++){
                if(divisorSums[a-1] == b && divisorSums[b-1] == a){
                    sum += a;
                    sum += b;
                }
            }
        }
        return sum;
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
