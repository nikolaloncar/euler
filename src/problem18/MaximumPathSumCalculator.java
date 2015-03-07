package problem18;

public class MaximumPathSumCalculator {
    public static int maxPathSum(final int[][] triangle){
        return maxPathSum(triangle, 0, 0);
    }

    public static int maxPathSum(final int[][] triangle, final int row, final int position){
        return (triangle.length-1) > row
                ? triangle[row][position] + Math.max(maxPathSum(triangle, row + 1, position), maxPathSum(triangle, row+1, position+1))
                : triangle[row][position];
    }
}
