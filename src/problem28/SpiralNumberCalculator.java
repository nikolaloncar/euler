package problem28;

public class SpiralNumberCalculator {
    public static long diagonalSumOfSpiral(final int size){
        int step = size-1;
        long currentNumber = size*size;
        long sum = 1;
        while(currentNumber > 1){
            for(int i = 0; i < 4; i++){
                sum += currentNumber;
                currentNumber -= step;
            }
            step -= 2;
        }
        return sum;
    }
}
