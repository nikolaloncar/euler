package problem8;

public class SeriesProductCalculator {
    public static int largestSeriesProduct(final String series, final int range){
        int maxProduct = 1;
        for(int i = 0; i < range; i++){
            maxProduct *= series.charAt(i)-48;
        }
        int currentProduct = maxProduct;
        final int length = series.length();
        for(int i = 0; i < length - range; i++){
            int prev = series.charAt(0)-48;
            if(prev > 0) currentProduct /= prev;
            currentProduct *= series.charAt(i+range)-48;
            if(currentProduct > maxProduct) maxProduct = currentProduct;
        }
        return maxProduct;
    }
}
