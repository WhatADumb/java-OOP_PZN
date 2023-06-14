package firmansyah.java.util;

public class MathUtil {
    public static int mathSum(int... values){
        int total = 0;

        for(int value : values){
            total += value;
        }

        return total;
    }
}
