package problem4;

public class PalindromProductCalculator {
    public static int calculateLargestPalindromeProduct(final int factorLength){
        final int limit = (int) Math.pow(10, factorLength);
        final int start = limit/10;
        int maxProduct = 0;
        int currentProduct;
        for(int leftFactor = start; leftFactor < limit; leftFactor++){
            for(int rightFactor = leftFactor; rightFactor < limit; rightFactor++){
                currentProduct = leftFactor * rightFactor;
                if(isPalindrome(currentProduct) && currentProduct > maxProduct) maxProduct = currentProduct;
            }
        }

        return maxProduct;
    }

    private static boolean isPalindrome(int number){
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
}
