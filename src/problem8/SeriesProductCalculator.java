package problem8;

public class SeriesProductCalculator {
    public static long largestSeriesProduct(final String series, final int range) throws Exception {
        byte[] numbers = new byte[series.length()];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (byte) (series.charAt(i)-48);
        }

        long maxProduct = 0;
        for(int i = 0; i < numbers.length - (range-1); i++){
            long product = product(numbers, i, i+range);
            if(product > maxProduct) maxProduct = product;
        }
        return maxProduct;
    }

    public static long product(final byte[] numbers, final int start, final int end){
        long product = 1;
        for(int i = start; i < end; i++){
            product *= numbers[i];
        }
        return product;
    }
}
