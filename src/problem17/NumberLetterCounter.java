package problem17;

public class NumberLetterCounter {
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
        int thousands = onesCount(number / 1000);
        if(thousands > 0) thousands += 8;

        //Hundreds
        int hundreds = onesCount((number % 1000) / 100);
        if(hundreds > 0) hundreds += 7;

        //Tens
        int tens = tensCount((number % 100) / 10);

        //Ones
        int ones = onesCount(number % 10);

        int letterCount = 0;
        letterCount += thousands;
        letterCount += hundreds;
        if(letterCount > 0 && tens + ones > 0) letterCount += 3;
        int n = number % 100;
        if(10 < n && n < 20) {
            letterCount += specialCount(n);
        } else {
            letterCount += tens;
            letterCount += ones;
        }
        return letterCount;
    }

    public static int onesCount(final int number){
        switch (number){
            case 0: return 0;
            case 1: return 3;
            case 2: return 3;
            case 3: return 5;
            case 4: return 4;
            case 5: return 4;
            case 6: return 3;
            case 7: return 5;
            case 8: return 5;
            case 9: return 4;
            default: return 0;
        }
    }

    public static int tensCount(final int number){
        switch (number){
            case 0: return 0;
            case 1: return 3;
            case 2: return 6;
            case 3: return 6;
            case 4: return 5;
            case 5: return 5;
            case 6: return 5;
            case 7: return 7;
            case 8: return 6;
            case 9: return 6;
            default: return 0;
        }
    }

    public static int specialCount(final int number){
        switch (number){
            case 11:
            case 12: return 6;
            case 13:
            case 14: return 8;
            case 15:
            case 16: return 7;
            case 17: return 9;
            case 18: return 8;
            case 19: return 8;
            default: return 0;
        }
    }
}
