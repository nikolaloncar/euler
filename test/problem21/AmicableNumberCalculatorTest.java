package problem21;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static problem21.AmicableNumberCalculator.areAmicable;
import static problem21.AmicableNumberCalculator.divisorSum;
import static problem21.AmicableNumberCalculator.sumOfAmicableNumbers;

public class AmicableNumberCalculatorTest {

    @Test
    public void testAreAmicable() throws Exception {
        assertTrue(areAmicable(220, 284));
        assertFalse(areAmicable(220, 285));
    }

    @Test
    public void testDivisorSum() throws Exception {
        assertEquals(220, divisorSum(284));
        assertEquals(284, divisorSum(220));
    }

    @Test
    public void testSumOfAmicableNumbers() throws Exception {
        System.out.println("Sum of amicable numbers under [10,000] = " + sumOfAmicableNumbers(10000));
    }
}