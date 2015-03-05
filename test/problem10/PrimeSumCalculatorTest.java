package problem10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeSumCalculatorTest {

    @Test
    public void testSumOfPrimes() throws Exception {
        assertEquals(17, PrimeSumCalculator.sumOfPrimes(10));
        assertEquals(41, PrimeSumCalculator.sumOfPrimes(15));
        System.out.println("Sum of primes below [2,000,000] = " + PrimeSumCalculator.sumOfPrimes(2_000_000));
    }
}