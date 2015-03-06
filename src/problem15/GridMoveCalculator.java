package problem15;

public class GridMoveCalculator {
    public static long numberOfPossibleRoutes(final int gridSize){
        long paths = 1;
        for(int i = 0; i < gridSize; i++){
            paths *= (2 * gridSize) - i;
           paths /= i + 1;
        }
        return paths;
    }
}
