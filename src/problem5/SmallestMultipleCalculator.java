package problem5;

public class SmallestMultipleCalculator {
    public static int bruteForce(final int from, final int to){
        int currentNum = 1;
        while(!fullyDivisible(currentNum, from, to)) currentNum++;
        return currentNum;
    }

    public static boolean fullyDivisible(final int number, final int from, final int to){
        for(int i = from; i < to+1; i++){
            if(number % i != 0) return false;
        }
        return true;
    }
}
