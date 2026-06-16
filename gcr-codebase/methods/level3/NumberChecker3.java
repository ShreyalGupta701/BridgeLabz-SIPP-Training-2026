import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {

    static int[] reverseArray(
            int[] digits) {

        int[] reverse =
                new int[digits.length];

        for (int i = 0;
             i < digits.length;
             i++) {

            reverse[i] =
                    digits[
                            digits.length
                                    - 1
                                    - i];
        }

        return reverse;
    }

    static boolean compareArrays(
            int[] a,
            int[] b) {

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        System.out.print(
                "Enter Number: ");

        String number =
                sc.next();

        int[] digits =
                new int[number.length()];

        for (int i = 0;
             i < number.length();
             i++) {

            digits[i] =
                    number.charAt(i)
                            - '0';
        }

        int[] reverse =
                reverseArray(digits);

        System.out.println(
                "Palindrome = "
                        + compareArrays(
                        digits,
                        reverse));
    }
}