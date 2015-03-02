package problem1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultipleAdderTest {
    @Test
    public void testSumOfMultiples() throws Exception {
        assertEquals(23, MultipleAdder.streamSum(10, new int[]{3, 5}));
        assertEquals(78, MultipleAdder.streamSum(20, new int[]{3, 5}));
        System.out.println(MultipleAdder.streamSum(1000, new int[]{3, 5}));
    }

    @Test
    public void performanceTest() throws Exception {
        final int limit = 1_000_000;
        final int[] multiples = new int[]{3, 5, 24, 37};

        System.out.println("Running stream sum...");
        long before = System.nanoTime();
        MultipleAdder.streamSum(limit, multiples);
        long after = System.nanoTime();
        System.out.println("Time to complete stream sum = " + (after - before) / 1_000 + "ns.");

        System.out.println("Running optimized sum...");
        before = System.nanoTime();
        MultipleAdder.optimizedSum(limit, multiples);
        after = System.nanoTime();
        System.out.println("Time to complete optimized sum = " + (after - before) / 1_000 + "ns.");
    }
}
