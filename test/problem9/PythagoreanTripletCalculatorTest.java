package problem9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PythagoreanTripletCalculatorTest {

    @Test
    public void testCalculateTripletProduct() throws Exception {
        //3^2 + 4^2 = 5^2
        //sum = 3 + 4 + 5 = 12
        //product = 3 * 4 * 5 = 60
        assertEquals(60, PythagoreanTripletCalculator.calculateTripletProduct(12));
        System.out.println("Triplet product for sum [1,000] = " + PythagoreanTripletCalculator.calculateTripletProduct(1000));
    }
}