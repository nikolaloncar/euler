package problem5;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SmallestMultipleCalculatorTest {

    @Test
    public void testBruteForce() throws Exception {
        System.out.println("Smallest multiple from 1 to 20 = " + SmallestMultipleCalculator.bruteForce(1, 20));
    }

    @Test
    public void testFullyDivisible() throws Exception {
        assertTrue(SmallestMultipleCalculator.fullyDivisible(6, 1, 3));
        assertTrue(SmallestMultipleCalculator.fullyDivisible(12, 1, 4));
        assertTrue(SmallestMultipleCalculator.fullyDivisible(2520, 1, 10));
    }
}