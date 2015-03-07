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

    public static int maxPathSumOptimized(final int[][] triangle){
        for(int row = triangle.length-2; row >= 0; row--){
            for(int pos = 0; pos < triangle[row+1].length-1; pos++){
                triangle[row][pos] += Math.max(triangle[row+1][pos], triangle[row+1][pos+1]);
            }
        }
        return triangle[0][0];
    }
}
