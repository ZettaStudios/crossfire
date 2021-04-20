package util;

public class Math {
    public static double round(double d, int precision) {
        return ((double) java.lang.Math.round(d * java.lang.Math.pow(10, precision))) / java.lang.Math.pow(10, precision);
    }
}
