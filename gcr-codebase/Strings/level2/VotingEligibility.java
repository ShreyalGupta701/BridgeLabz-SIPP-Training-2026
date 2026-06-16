import java.util.Scanner;

public class VotingEligibility {

    static int[] getAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10;
        }

        return ages;
    }

    static String[][] checkVoting(int[] ages) {

        String[][] result =
                new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] =
                    String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }

        return result;
    }

    static void display(String[][] arr) {

        System.out.println("Age\tStatus");

        for (String[] row : arr) {
            System.out.println(row[0]
                    + "\t"
                    + row[1]);
        }
    }

    public static void main(String[] args) {

        int[] ages = getAges(10);

        String[][] result =
                checkVoting(ages);

        display(result);
    }
}