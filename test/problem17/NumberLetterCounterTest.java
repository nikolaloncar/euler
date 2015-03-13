package problem17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem17.NumberLetterCounter.*;

public class NumberLetterCounterTest {

    @Test
    public void testLetterCount() throws Exception {
        assertEquals("twentyfour".length(), letterCount(24));
        assertEquals("twohundredandeightyseven".length(), letterCount(287));
        assertEquals("onethousand".length(), letterCount(1000));
        assertEquals("onehundred".length(), letterCount(100));
        assertEquals("ten".length(), letterCount(10));
        assertEquals("one".length(), letterCount(1));
        assertEquals("onehundredandone".length(), letterCount(101));
        assertEquals("seventeen".length(), letterCount(17));
    }

    @Test
    public void testLetterCountSum() throws Exception {
        System.out.println("Letter count sum from [1] to [1,000] = " + letterCountSum(1000));
    }
}