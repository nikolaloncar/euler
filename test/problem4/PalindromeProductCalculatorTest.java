package problem4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeProductCalculatorTest {

    @Test
    public void testCalculateLargestPalindromeProduct() throws Exception {
        assertEquals(9009, PalindromeProductCalculator.calculateLargestPalindromeProductMod(2));
        System.out.println("Largest palindrome product for 3 digit factors = " + PalindromeProductCalculator.calculateLargestPalindromeProductMod(3));
    }

    @Test
    public void testPerformance() throws Exception {
        final int factorLength = 6;

        System.out.println("Testing char prime method for factors of length [" + factorLength + "]...");
        long before = System.nanoTime();
        PalindromeProductCalculator.calculateLargestPalindromeProductChar(5);
        long after = System.nanoTime();
        System.out.println("Char prime method took: " + (after - before) / 1_000_000 + "ms.");

        System.out.println("Testing mod prime method for factors of length [" + factorLength + "]...");
        before = System.nanoTime();
        PalindromeProductCalculator.calculateLargestPalindromeProductMod(5);
        after = System.nanoTime();
        System.out.println("Mod prime method took: " + (after - before) / 1_000_000 + "ms.");
    }
}