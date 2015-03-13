package problem17;

public class NumberLetterCounter {
    public static final byte[] ONES = new byte[]{
            0, 3, 3, 5, 4, 4, 3, 5, 5, 4
    };

    public static final byte[] TENS = new byte[]{
            0, 3, 6, 6, 5, 5, 5, 7, 6, 6
    };

    public static final byte[] TEENS = new byte[]{
            0, 6, 6, 8, 8, 7, 7, 9, 8, 8
    };

    public static int letterCountSum(final int max){
        int sum = 0;
        for(int i = 1; i <= max; i++){
            sum += letterCount(i);
        }
        return sum;
    }

    public static int letterCount(final int number){
        if(number == 0) return 4;

        //Thousands
        int thousands = ONES[number / 1000];
        if(thousands > 0) thousands += 8;

        //Hundreds
        int hundreds = ONES[(number % 1000) / 100];
        if(hundreds > 0) hundreds += 7;

        int letterCount = 0;
        letterCount += thousands;
        letterCount += hundreds;
        int n = number % 100;
        if(letterCount > 0 && n > 0) letterCount += 3;
        if(10 < n && n < 20) {
            letterCount += TEENS[n%10];
        } else {
            letterCount += TENS[(number % 100) / 10];
            letterCount += ONES[number % 10];
        }
        return letterCount;
    }


}
