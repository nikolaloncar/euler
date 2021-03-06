package problem18;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static problem18.MaximumPathSumCalculator.maxPathSum;
import static problem18.MaximumPathSumCalculator.maxPathSumOptimized;

public class MaximumPathSumCalculatorTest {

    private static final int[][] TEST_TRIANGLE = new int[][]{
            {3},
            {7, 4,},
            {2, 4, 6,},
            {8, 5, 9, 3}
    };
    private static final int[][] TRIANGLE = new int[][]{
            {75},
            {95, 64},
            {17, 47, 82},
            {18, 35, 87, 10},
            {20, 4, 82, 47, 65},
            {19, 1, 23, 75, 3, 34},
            {88, 2, 77, 73, 7, 63, 67},
            {99, 65, 4, 28, 6, 16, 70, 92},
            {41, 41, 26, 56, 83, 40, 80, 70, 33},
            {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
            {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
            {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
            {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
            {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
            {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
    };


    @Test
    public void testMaxPathSum() throws Exception {
        assertEquals(23, maxPathSum(TEST_TRIANGLE));
        System.out.println("Maximum path sum for [TRIANGLE] = " + maxPathSum(TRIANGLE));
    }

    @Test
    public void testMaxPathSumOptimized() throws Exception {
        int[][] localTriangle = new int[TEST_TRIANGLE.length][];
        for(int i = 0; i < TEST_TRIANGLE.length; i++){
            localTriangle[i] = Arrays.copyOf(TEST_TRIANGLE[i], TEST_TRIANGLE[i].length);
        }
        assertEquals(23, maxPathSumOptimized(localTriangle));
    }

    @Test
    public void testPerformance() throws Exception {
        int[][] localTriangle = new int[TRIANGLE.length][];
        for(int i = 0; i < TRIANGLE.length; i++){
            localTriangle[i] = Arrays.copyOf(TRIANGLE[i], TRIANGLE[i].length);
        }

        long before, after, nonOpt, opt;
        before = System.nanoTime();
        maxPathSum(TRIANGLE);
        after = System.nanoTime();
        nonOpt = after - before;
        before = System.nanoTime();
        maxPathSumOptimized(localTriangle);
        after = System.nanoTime();
        opt = after-before;

        System.out.println("Non-optimized time = " + nonOpt / 1_000 + "ms");
        System.out.println("Optimized time = " + opt / 1_000 + "ms");
    }
}