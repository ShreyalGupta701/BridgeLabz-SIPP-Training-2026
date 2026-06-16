import java.util.Scanner;

public class ShortestLongestWord {

    static String[] splitText(String text) {
        return text.split(" ");
    }

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

    static int[] shortestLongest(String[] words) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {

            if (findLength(words[i]) <
                    findLength(words[shortest]))
                shortest = i;

            if (findLength(words[i]) >
                    findLength(words[longest]))
                longest = i;
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        int[] result = shortestLongest(words);

        System.out.println("Shortest Word: "
                + words[result[0]]);

        System.out.println("Longest Word: "
                + words[result[1]]);
    }
}