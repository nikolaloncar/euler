package problem14;

public class CollatzCalculator {
    public static int chainLength(long number){
        int chainLength = 1;
        while(number > 1){
            if((number & 1) == 0) number /= 2;
            else number = (number * 3) + 1;
            chainLength++;
        }
        return chainLength;
    }
}
