package problem3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeFactorCalculatorTest {

    @Test
    public void testLargestPrimeFactor() throws Exception {
        assertEquals(29, PrimeFactorCalculator.largestPrimeFactor(13195));
        System.out.println("Largest prime factor of [600851475143] = " + PrimeFactorCalculator.largestPrimeFactor(600851475143L));
    }


    @Test
    public void testFastPrimeFactor() throws Exception {
        assertEquals(29, PrimeFactorCalculator.largestPrimeFactor(13195));
    }

    @Test
    public void testPerformance() throws Exception {
        long number = 7890257892378L;
        long before, after;

        System.out.print("My implementation time = ");
        before = System.nanoTime();
        PrimeFactorCalculator.largestPrimeFactor(number);
        after = System.nanoTime();
        System.out.println((after - before) / 1_000 + "ns");

        System.out.print("Euler suggested implementation time = ");
        before = System.nanoTime();
        PrimeFactorCalculator.fastPrimeFactor(number);
        after = System.nanoTime();
        System.out.println((after - before) / 1_000 + "ns");
    }
}