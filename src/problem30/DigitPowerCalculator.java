package problem30;

public class DigitPowerCalculator {
    public static int calculatePowerSum(final int power){
        int[] powers = generatePowers(power);
        final int start = 2;
        final int end = maxNum(powers);
        int sum = 0;
        for(int number = start; number < end; number++){
            int num = powerNumber(powers, number);
            if(num == number) sum += num;
        }
        return sum;
    }

    public static int maxNum(final int[] powers){
        int num = 9;
        int powerSum = powers[9];
        while(powerSum > num){
            num = (num * 10) + 9;
            powerSum += powers[9];
        }
        return num;
    }

    public static int powerNumber(final int[] powers, int number){
        int sum = 0;
        while(number > 0){
            sum += powers[number % 10];
            number /= 10;
        }
        return sum;
    }

    public static int[] generatePowers(final int power){
        int[] powers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < 10; i++){
            powers[i] = (int) Math.pow(powers[i], power);
        }
        return powers;
    }
}