import java.util.Scanner;

public class StudentGradeSystem {

    static int[][] generateScores(int students) {

        int[][] scores =
                new int[students][3];

        for (int i = 0; i < students; i++) {

            for (int j = 0; j < 3; j++) {

                scores[i][j] =
                        (int)(Math.random() * 100);
            }
        }

        return scores;
    }

    static double[][] calculateResult(
            int[][] scores) {

        double[][] result =
                new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total =
                    scores[i][0]
                    + scores[i][1]
                    + scores[i][2];

            double average =
                    total / 3.0;

            double percentage =
                    total / 3.0;

            result[i][0] = total;
            result[i][1] =
                    Math.round(
                            average * 100.0)
                            / 100.0;

            result[i][2] =
                    Math.round(
                            percentage * 100.0)
                            / 100.0;
        }

        return result;
    }

    static String getGrade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Students: ");

        int students = sc.nextInt();

        int[][] scores =
                generateScores(students);

        double[][] result =
                calculateResult(scores);

        System.out.println(
                "\nPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0;
             i < students;
             i++) {

            System.out.println(
                    scores[i][0] + "\t"
                    + scores[i][1] + "\t"
                    + scores[i][2] + "\t"
                    + (int)result[i][0] + "\t"
                    + result[i][1] + "\t"
                    + result[i][2] + "\t"
                    + getGrade(result[i][2]));
        }
    }
}