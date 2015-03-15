package problem29;

import java.util.HashSet;
import java.util.Set;

public class DistinctPowerCalculator {
    public static long distinctPowerCount(final int base, final int power){
        Set<Double> distinctPowers = new HashSet<>(base*power);
        for(int a = 2; a <= base; a++){
            for(int b = 2; b <= power; b++){
                distinctPowers.add(Math.pow(a, b));
            }
        }
        return distinctPowers.size();
    }
}
