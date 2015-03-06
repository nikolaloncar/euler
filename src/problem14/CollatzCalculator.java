package problem14;

public class CollatzCalculator {
    public static int findLongestChain(int maxNumber){
        int maxChainLength = 0;
        int maxChainNumber = 0;
        for(int i = 1; i < maxNumber; i++){
            int chainLength = chainLength(i);
            if(chainLength > maxChainLength){
                maxChainLength = chainLength;
                maxChainNumber = i;
            }
        }
        return maxChainNumber;
    }

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
