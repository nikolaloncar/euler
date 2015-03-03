package problem4;

public class PalindromeProductCalculator {
    public static int calculateLargestPalindromeProductChar(final int factorLength){
        final int limit = (int) Math.pow(10, factorLength);
        final int start = limit/10;
        int maxProduct = 0;
        int currentProduct;
        for(int leftFactor = limit-1; leftFactor >= start; leftFactor--){
            for(int rightFactor = leftFactor; rightFactor >= start; rightFactor--){
                currentProduct = leftFactor * rightFactor;
                if(currentProduct > maxProduct && isPalindromeChar(currentProduct))
                    maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }

    public static int calculateLargestPalindromeProductMod(final int factorLength){
        final int limit = (int) Math.pow(10, factorLength);
        final int start = limit/10;
        int maxProduct = 0;
        int currentProduct;
        for(int leftFactor = limit-1; leftFactor >= start; leftFactor--){
            for(int rightFactor = leftFactor; rightFactor >= start; rightFactor--){
                currentProduct = leftFactor * rightFactor;
                if(currentProduct > maxProduct && isPalindromeNum(currentProduct))
                    maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }

    private static boolean isPalindromeChar(int number){
        final char[] numberChars = String.valueOf(number).toCharArray();
        int leftIndex = 0;
        int rightIndex = numberChars.length-1;
        while(leftIndex < rightIndex){
            if(numberChars[leftIndex] != numberChars[rightIndex]) return false;
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    private static boolean isPalindromeNum(final int number){
        int tempNumber = number;
        int reverse = 0;
        while(tempNumber > 0){
            reverse = 10 * reverse + tempNumber % 10;
            tempNumber /= 10;
        }
        return number == reverse;
    }
}
