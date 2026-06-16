import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {

        if (age < 0)
            return false;

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        StudentVoteChecker obj =
                new StudentVoteChecker();

        for (int i = 0; i < ages.length; i++) {

            System.out.print(
                    "Enter Age of Student "
                            + (i + 1) + ": ");

            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Status");

        for (int age : ages) {

            if (obj.canStudentVote(age))
                System.out.println(
                        age + " -> Can Vote");
            else
                System.out.println(
                        age + " -> Cannot Vote");
        }
    }
}