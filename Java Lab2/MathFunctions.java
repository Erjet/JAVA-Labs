public class MathFunctions {

    public static double Number19(double a, double b, double c, double d) {
        double y = Math.pow(Math.tan(a), 1 / (c)) / (1 + (Math.sinh(b) / Math.log(Math.abs(d + c))));
        return y;
    }

    public static double Number20(double a, double b, double c, double d) {
        double y = 2 * Math.log(Math.pow(b, a)) + Math.abs(Math.asin(-(Math.pow((d / c), 1 / 2))));
        return y;
    }

    public static double Number21(double a, double b, double c, double d) {
        double y = 3 * (Math.log(Math.abs(a / b)) + Math.pow(Math.cos(c) + Math.pow(Math.E, d), 1 / 2));
        return y;
    }

    public static void main(String[] args) {
        double a = 1.234;
        double b = -3.12;
        double c = 5.45;
        double d = 2.0;

        double result = Number19(a, b, c, d);
        System.out.println("№19 y = " + result);

        a = 3.56;
        b = 1.02;
        c = 3;
        d = 2.43;

        result = Number20(a, b, c, d);
        System.out.println("№20 y = " + result);

        a = -2.54;
        b = 1.23;
        c = -2.14;
        d = -0.23;

        result = Number21(a, b, c, d);
        System.out.println("№21 y = " + result);
    }
}