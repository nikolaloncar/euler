package problem29;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem29.DistinctPowerCalculator.distinctPowerCount;

public class DistinctPowerCalculatorTest {

    @Test
    public void testDistinctPowers() throws Exception {
        assertEquals(15, distinctPowerCount(5, 5));
        System.out.println("Distinct powers for a[100] and b[100] = " + distinctPowerCount(100, 100));
    }
}