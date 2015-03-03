package problem30;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitPowerCalculatorTest {

    @Test
    public void testCalculatePowerSum() throws Exception {
        assertEquals(19316, DigitPowerCalculator.calculatePowerSum(4));
        System.out.println("Power Sum for power [5] = " + DigitPowerCalculator.calculatePowerSum(5));
    }

    @Test
    public void testPowerNumber() throws Exception {
        assertEquals(1634, DigitPowerCalculator.powerNumber(4, 1634));
        assertEquals(8208, DigitPowerCalculator.powerNumber(4, 8208));
        assertEquals(9474, DigitPowerCalculator.powerNumber(4, 9474));
    }
}