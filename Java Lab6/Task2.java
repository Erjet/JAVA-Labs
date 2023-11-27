public class Task2 {

    public static int numbersInString(String str) {

        String[] words = str.split("\\s+");

        int countNumbers = 0;
        for (String word : words) {
            if (word.matches("\\d+")) {
                countNumbers = countNumbers + 1;
            }
        }
        return countNumbers;
    }

    public static void main(String[] args) {

        String str = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        int num = numbersInString(str);
        System.out.println("result: " + num);
    }
}