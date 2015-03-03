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
        int[] powers = DigitPowerCalculator.generatePowers(4);
        assertEquals(1634, DigitPowerCalculator.powerNumber(powers, 1634));
        assertEquals(8208, DigitPowerCalculator.powerNumber(powers, 8208));
        assertEquals(9474, DigitPowerCalculator.powerNumber(powers, 9474));
    }
}