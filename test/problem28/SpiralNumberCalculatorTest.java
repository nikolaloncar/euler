package problem28;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem28.SpiralNumberCalculator.*;

public class SpiralNumberCalculatorTest {

    @Test
    public void testDiagonalSumOfSpiral() throws Exception {
        assertEquals(101, diagonalSumOfSpiral(5));
        System.out.println("Diagonal sum for spiral of size [1,001] = " + diagonalSumOfSpiral(1001));
    }
}