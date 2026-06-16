import java.util.Scanner;

public class NumberChecker2 {

    static int[] getDigits(int number) {

        String num = String.valueOf(number);

        int[] digits =
                new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            digits[i] =
                    num.charAt(i) - '0';
        }

        return digits;
    }

    static int sumDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits)
            sum += digit;

        return sum;
    }

    static boolean isHarshad(
            int number,
            int[] digits) {

        return number %
                sumDigits(digits)
                == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits =
                getDigits(number);

        System.out.println(
                "Sum of Digits = "
                        + sumDigits(digits));

        System.out.println(
                "Harshad Number = "
                        + isHarshad(
                        number,
                        digits));
    }
}