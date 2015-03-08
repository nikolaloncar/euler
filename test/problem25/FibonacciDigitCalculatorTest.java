package problem25;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem25.FibonacciDigitCalculator.*;

public class FibonacciDigitCalculatorTest {

    @Test
    public void testFibonacciNumberWithMinDigits() throws Exception {
        assertEquals(1, fibonacciNumberWithMinDigits(1));
        assertEquals(7, fibonacciNumberWithMinDigits(2));
        assertEquals(12, fibonacciNumberWithMinDigits(3));
        System.out.println("Smallest Fibonacci number with [1,000] digits = " + fibonacciNumberWithMinDigits(1000));
    }
}