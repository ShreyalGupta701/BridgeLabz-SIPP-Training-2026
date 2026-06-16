import java.util.Scanner;

public class RecursiveSum {

    static int recursiveSum(int n) {

        if (n == 1)
            return 1;

        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int recursionResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Recursion Sum = " + recursionResult);
        System.out.println("Formula Sum = " + formulaResult);

        System.out.println(
                recursionResult == formulaResult ?
                        "Results Match" :
                        "Results Do Not Match");
    }
}