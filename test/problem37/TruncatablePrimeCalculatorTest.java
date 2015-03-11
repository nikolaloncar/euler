package problem37;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static problem37.TruncatablePrimeCalculator.*;

public class TruncatablePrimeCalculatorTest {

    @Test
    public void testSumOfTruncatablePrimes() throws Exception {
        System.out.println("Sum of first [11] truncatable primes = " + sumOfTruncatablePrimes(11));
    }

    @Test
    public void testIsTruncatablePrime() throws Exception {
        assertTrue(isTruncatablePrime(3797));
    }
}