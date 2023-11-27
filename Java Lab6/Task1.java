public class Task1 {

    public static String intToHexString(int i) {
        String string = Integer.toHexString(i).toUpperCase();
        return string;
    }

    public static void main(String[] args) {
        // int num = 1024;

        int[] nums = { 12312, 23213 };
        for (int i = 0; i < nums.length; i++) {
            String string = intToHexString(nums[i]);
            System.out.println(string);
        }

    }
}
