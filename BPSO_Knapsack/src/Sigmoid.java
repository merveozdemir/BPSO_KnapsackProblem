
public class Sigmoid {
    private static final double e = 2.71828182846;
    public static double function(double velocity) {
        double result = 0.0;
        result = 1/ (1 + Math.pow(e, -velocity));
        return result;
    }
}
