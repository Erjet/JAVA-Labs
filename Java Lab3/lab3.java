public class lab3 {

    public static double Number2(double t, double s, double k) {
        double sum = 0;
        if (k > 2 && k <= 25) {
            for (int i = 1; i < k; i++) {
                sum = sum + Math.log((-1) * t * i) * Math.cos(Math.sqrt(s * (1 / (i * i))));
            }
            return sum;
        } else {
            throw new IllegalArgumentException("param k = " + k);
        }
    }

    public static double Number8(double t, double n, double l) {
        double sum = 0;
        if ((l % 2 == 0)) {
            for (int i = 1; i < n; i++) {
                sum = sum + (l * (1 / Math.sqrt(t)));
            }
            return sum;
        } else {
            for (int i = 1; i < n; i++) {
                sum = sum + (l * (1 / t));
            }
            return sum;
        }
    }

    public static double Number14(double epsilon) {
        double sum = 0;
        double step = 0;
        int i = 0;
        double fact = 0;
        do {
            i = i + 1;
            fact = factorial(i + 1);
            step = (Math.pow(-2, i) / (fact));
            sum = sum + step;
        } while (Math.abs(step) >= epsilon);
        return sum;
    }

    public static int factorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * factorial(f - 1);
        }
    }

    public static void main(String[] args) {

        double result = 0;
        try {
            result = Number2(1, 4, 3);
            System.out.println("№2 y = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());

        }
        result = Number8(1, 4, 2);
        System.out.println("№8 y = " + result);

        result = Number14(0.1);
        System.out.println("№14 y = " + result);
    }
}