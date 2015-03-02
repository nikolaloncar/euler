package problem2;

public class EvenFibonacciAdder {
    public static long calculateSum(final int limit){
        long sum = 0;
        long previousValue = 1;
        long currentValue = 2;
        long newValue;
        while(currentValue < limit){
            sum += currentValue;
            for(int i = 0; i < 3; i++){
                newValue = currentValue + previousValue;
                previousValue = currentValue;
                currentValue = newValue;
            }
        }
        return sum;
    }
}
