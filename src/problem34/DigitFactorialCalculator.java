package problem34;

public class DigitFactorialCalculator {
    public static final int[] factorials = computeFactorials(10);

    private static int[] computeFactorials(int number) {
        int[] factorials = new int[number];
        for(int i = 0; i < number; i++){
            factorials[i] = factorial(i);
        }
        return factorials;
    }

    public static int factorial(final int number){
        if(number == 0) return 1;
        int factorial = 1;
        for(int i = 2; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int digitFactorialSum(){
        int sum = 0;
        for(int n = 10; n < factorials[9]*7; n++){ //9!*7 is the first all-9 number that is bigger than it's factorial sum
            if(isDigitFactorial(n)){
                sum += n;
            }
        }
        return sum;
    }

    public static boolean isDigitFactorial(final int number){
        return digitFactorialSum(number) == number;
    }

    public static long digitFactorialSum(int number){
        int n = number;
        int sum = 0;
        while(n > 0){
            sum += factorials[n % 10];
            n /= 10;
        }
        return sum;
    }
}
