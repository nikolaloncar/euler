package problem6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumSquareDifferenceCalculatorTest {

    @Test
    public void testCalculateSumSquareDifference() throws Exception {
        assertEquals(2640, SumSquareDifferenceCalculator.calculateSumSquareDifference(10));
        System.out.println("Square of squares different for the first [100] number = " + SumSquareDifferenceCalculator.calculateSumSquareDifference(100));
    }

    @Test
    public void testSumOfSquares() throws Exception {
        assertEquals(385, SumSquareDifferenceCalculator.sumOfSquares(10));
    }

    @Test
    public void testSquareOfSum() throws Exception {
        assertEquals(3025, SumSquareDifferenceCalculator.squareOfSum(10));
    }
}