package problem14;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem14.CollatzCalculator.chainLength;

public class CollatzCalculatorTest {

    @Test
    public void testChainLength() throws Exception {
        assertEquals(10, chainLength(13));
        assertEquals(5, chainLength(16));
        assertEquals(1, chainLength(1));
        assertEquals(8, chainLength(3));
    }
}