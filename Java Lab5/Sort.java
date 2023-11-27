public class Sort {

    public static void bubbleSort(short[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    short temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

    }

    public static short[] selectionSort(short[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            short temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        short[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        short[] newarr = {};

        newarr = selectionSort(arr);

        System.out.println("Sorted array by selection:");
        for (short num : newarr) {
            System.out.print(num + " ");
        }

        System.out.print("\n");
        short[] arr2 = { 64, 34, 25, 12, 22, 11, 90 };

        bubbleSort(arr);

        System.out.println("Sorted array by bubble:");
        for (short num : arr2) {
            System.out.print(num + " ");
        }
    }
}