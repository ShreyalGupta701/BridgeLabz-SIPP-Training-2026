import java.util.Scanner;

public class SplitWords {

    static String[] splitText(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                result[index++] = word;
                word = "";
            }
        }

        result[index] = word;

        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Arrays Equal: "
                + compareArrays(userWords, builtInWords));
    }
}