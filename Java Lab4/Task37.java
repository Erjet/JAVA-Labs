public class Task37 {

    public static int arrayMix(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 3 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4 };

        int num = arrayMix(A);

        System.out.println(num);
    }
}