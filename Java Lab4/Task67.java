public class Task67 {

    public static int[] arrayMix(int[] A, int[] B) {
        if (A.length != B.length) {
            throw new IllegalArgumentException("Different array lengths");
        }
        int[] C = new int[2 * A.length];

        for (int i = 0; i < A.length; i++) {
            C[2 * i] = A[i];
            C[2 * i + 1] = B[i];
        }
        return C;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4 };
        int[] B = { 5, 6, 7, 8 };
        int[] C = new int[2 * A.length];
        try {
            C = arrayMix(A, B);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Масив C:");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}