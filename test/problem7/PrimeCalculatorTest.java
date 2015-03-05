package problem7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeCalculatorTest {

    @Test
    public void testPrimeAtIndex() throws Exception {
        assertEquals(13, PrimeCalculator.primeAtIndex(6));
        assertEquals(17, PrimeCalculator.primeAtIndex(7));
        System.out.println("Prime number at index [10,001] = " + PrimeCalculator.primeAtIndex(10_001));

        //Because why not?
        System.out.println("Prime number at index [1,000,000] = " + PrimeCalculator.primeAtIndex(1_000_000));
    }

    @Test
    public void testIsPrime() throws Exception {
        assertTrue(PrimeCalculator.isPrime(3));
        assertTrue(PrimeCalculator.isPrime(17));
        assertFalse(PrimeCalculator.isPrime(81));
    }
}