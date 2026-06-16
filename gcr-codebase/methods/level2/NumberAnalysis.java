import java.util.Scanner;

public class NumberAnalysis {

    static boolean isPositive(int num) {
        return num >= 0;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int compare(
            int number1,
            int number2) {

        if (number1 > number2)
            return 1;

        if (number1 < number2)
            return -1;

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(
                    "Enter Number "
                            + (i + 1)
                            + ": ");

            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {

            if (isPositive(num)) {

                if (isEven(num))
                    System.out.println(
                            num
                                    + " Positive Even");

                else
                    System.out.println(
                            num
                                    + " Positive Odd");

            } else {

                System.out.println(
                        num
                                + " Negative");
            }
        }

        int result =
                compare(
                        numbers[0],
                        numbers[4]);

        if (result == 1)
            System.out.println(
                    "First Element is Greater");

        else if (result == -1)
            System.out.println(
                    "First Element is Smaller");

        else
            System.out.println(
                    "Both Elements are Equal");
    }
}