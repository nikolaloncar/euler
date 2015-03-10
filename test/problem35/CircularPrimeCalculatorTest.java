package problem35;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static problem35.CircularPrimeCalculator.*;

public class CircularPrimeCalculatorTest {

    @Test
    public void testCircularPrimesBelow() throws Exception {
        assertEquals(4, circularPrimesBelow(10));
        assertEquals(13, circularPrimesBelow(100));
        System.out.println("Number of circular primes below [1,000,000] = " + circularPrimesBelow(1_000_000));
    }

    @Test
    public void testIsCircularPrime() throws Exception {
        assertTrue(isCircularPrime(197));
        assertFalse(isCircularPrime(196));
        assertFalse(isCircularPrime(1));
        assertTrue(isCircularPrime(2));
        assertFalse(isCircularPrime(29));
        assertFalse(isCircularPrime(101));
    }

    @Test
    public void testShiftDigitsRight() throws Exception {
        assertEquals(92, shiftDigitsRight(29));
        assertEquals(51234, shiftDigitsRight(12345));
        assertEquals(912345678, shiftDigitsRight(123456789));
    }

    @Test
    public void testContainsZero() throws Exception {
        assertFalse(containsZero(123456789));
        assertTrue(containsZero(101));
    }
}