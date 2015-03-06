package problem15;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static problem15.GridMoveCalculator.numberOfPossibleRoutes;

public class GridMoveCalculatorTest {

    @Test
    public void testNumberOfPossibleRoutes() throws Exception {
        assertEquals(1, numberOfPossibleRoutes(0));
        assertEquals(2, numberOfPossibleRoutes(1));
        assertEquals(6, numberOfPossibleRoutes(2));
        System.out.println("Possible paths for grid size [20x20] = " + numberOfPossibleRoutes(20));
    }
}