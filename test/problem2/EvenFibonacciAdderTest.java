package problem2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenFibonacciAdderTest {

    @Test
    public void testCalculateSum() throws Exception {
        assertEquals(44, EvenFibonacciAdder.calculateSum(90));
        assertEquals(188, EvenFibonacciAdder.calculateSum(145));
        System.out.println("Sum up to 4,000,000 = " + EvenFibonacciAdder.calculateSum(4_000_000));
    }
}