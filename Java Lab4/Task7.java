public class Task7 {

    public static int arrayMix(int[] numbers) {

        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 6, 8, 1 };

        int num = arrayMix(A);

        System.out.println(num);
    }
}