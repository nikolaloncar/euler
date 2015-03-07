package problem20;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem20.FactorialDigitSumCalculator.factorialDigitSum;

public class FactorialDigitSumCalculatorTest {

    @Test
    public void testFactorialDigitSum() throws Exception {
        assertEquals(27, factorialDigitSum(10));
        System.out.println("Factorial digit sum for [100] = " + factorialDigitSum(100));
    }
}