package problem11;

public class GridProductCalculator {
    public static long maxProduct(final int[][] grid, final int length){
        long maxProduct = 0;
        long currentProduct = maxVerticalProduct(grid, length);
        if(currentProduct > maxProduct) maxProduct = currentProduct;
        currentProduct = maxHorizontalProduct(grid, length);
        if(currentProduct > maxProduct) maxProduct = currentProduct;
        currentProduct = maxDiagonalProduct(grid, length);
        if(currentProduct > maxProduct) maxProduct = currentProduct;
        return maxProduct;
    }

    public static long maxHorizontalProduct(final int[][] grid, final int length){
        int maxProduct = 0;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y <= grid.length-length; y++){
                int currentProduct = 1;
                for(int i = 0; i < length; i++){
                    currentProduct *= grid[x][y+i];
                }
                if(currentProduct > maxProduct) maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }

    public static long maxVerticalProduct(final int[][] grid, final int length){
        int maxProduct = 0;
        for(int y = 0; y < grid[0].length; y++){
            for(int x = 0; x <= grid[0].length-length; x++){
                int currentProduct = 1;
                for(int i = 0; i < length; i++){
                    currentProduct *= grid[x+i][y];
                }
                if(currentProduct > maxProduct) maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }

    public static long maxDiagonalProduct(final int[][] grid, final int length){
        return Math.max(maxLeftDiagonalProduct(grid, length), maxRightDiagonalProduct(grid, length));
    }

    public static long maxLeftDiagonalProduct(final int[][] grid, final int length){
        int maxProduct = 0;
        for(int x = 0; x <= grid.length-length; x++){
            for(int y = 0; y <= grid.length-length; y++){
                int currentProduct = 1;
                for(int i = 0; i < length; i++){
                    currentProduct *= grid[x+i][y+i];
                }
                if(currentProduct > maxProduct) maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }

    public static long maxRightDiagonalProduct(final int[][] grid, final int length){
        int maxProduct = 0;
        for(int x = length-1; x < grid.length; x++){
            for(int y = 0; y <= grid.length-length; y++){
                int currentProduct = 1;
                for(int i = 0; i < length; i++){
                    currentProduct *= grid[x-i][y+i];
                }
                if(currentProduct > maxProduct) maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }
}
