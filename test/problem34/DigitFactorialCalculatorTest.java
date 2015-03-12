package problem34;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static problem34.DigitFactorialCalculator.*;

public class DigitFactorialCalculatorTest {

    @Test
    public void testDigitFactorialSum() throws Exception {
        assertEquals(1, digitFactorialSum(1));
        assertEquals(2, digitFactorialSum(11));
        System.out.println(digitFactorialSum());
    }


    @Test
    public void testIsDigitFactorial() throws Exception {
        assertTrue(isDigitFactorial(145));
        assertFalse(isDigitFactorial(146));
    }

    @Test
    public void testFactorial() throws Exception {
        assertEquals(1, factorial(0));
        assertEquals(1, factorial(1));
        assertEquals(2, factorial(2));
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
    }
}