package problem12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem12.TriangularNumberCalculator.divisorCount;
import static problem12.TriangularNumberCalculator.numberWithMinDivisorCount;

public class TriangularNumberCalculatorTest {

    @Test
    public void testNumberWithMinDivisorCount() throws Exception {
        assertEquals(28, numberWithMinDivisorCount(5));
        System.out.println("Triangle number with at least [500] divisors = " + numberWithMinDivisorCount(500));
    }

    @Test
    public void testDivisorCount() throws Exception {
        assertEquals(1, divisorCount(1));
        assertEquals(2, divisorCount(3));
        assertEquals(4, divisorCount(6));
        assertEquals(4, divisorCount(10));
        assertEquals(4, divisorCount(15));
        assertEquals(6, divisorCount(28));
    }
}