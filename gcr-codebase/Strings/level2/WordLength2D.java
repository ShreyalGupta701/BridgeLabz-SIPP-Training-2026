import java.util.Scanner;

public class WordLength2D {

    static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static String[] splitText(String text) {

        String[] words = text.split(" ");
        return words;
    }

    static String[][] getWordLengths(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] result = getWordLengths(words);

        System.out.println("\nWord\tLength");

        for (String[] row : result) {
            System.out.println(row[0] + "\t" +
                    Integer.parseInt(row[1]));
        }
    }
}