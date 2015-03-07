package problem16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem16.PowerDigitCalculator.powerDigitSum;

public class PowerDigitCalculatorTest {

    @Test
    public void testPowerDigitSum() throws Exception {
        assertEquals(26, powerDigitSum(2, 15));
        assertEquals(25, powerDigitSum(2, 16));
        assertEquals(31, powerDigitSum(2, 20));
        System.out.println("Power digit sum of [2^1,000] = " + powerDigitSum(2, 1000));
    }
}