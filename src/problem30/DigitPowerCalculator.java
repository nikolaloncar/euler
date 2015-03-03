package problem30;

public class DigitPowerCalculator {
    public static int calculatePowerSum(final int power){
        final int start = 2;
        final int end = maxNum(power);
        int sum = 0;
        for(int number = start; number < end; number++){
            int num = powerNumber(power, number);
            if(num == number) sum += num;
        }
        return sum;
    }

    public static int maxNum(final int power){
        int num = 9;
        final int increment = (int) Math.pow(9, power);
        int powerSum = increment;
        while(powerSum > num){
            num = (num * 10) + 9;
            powerSum += increment;
        }
        return num;
    }

    public static int powerNumber(final int power, int number){
        int sum = 0;
        while(number > 0){
            sum += Math.pow(number % 10, power);
            number /= 10;
        }
        return sum;
    }
}