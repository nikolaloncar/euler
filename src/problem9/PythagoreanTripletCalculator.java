package problem9;

public class PythagoreanTripletCalculator {
    public static int calculateTripletProduct(final int sum){
        int c;
        for(int a = 1; a < sum/3; a++){
            for(int b = a+1; b < sum-(a+b); b++){
                c = sum - (a+b);
                if(a*a + b*b == c*c){
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
