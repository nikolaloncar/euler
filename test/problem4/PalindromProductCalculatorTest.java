package problem4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromProductCalculatorTest {

    @Test
    public void testCalculateLargestPalindromeProduct() throws Exception {
        assertEquals(9009, PalindromProductCalculator.calculateLargestPalindromeProduct(2));
        System.out.println("Largest palindrome product for 3 digit factors = " + PalindromProductCalculator.calculateLargestPalindromeProduct(3));
    }
}