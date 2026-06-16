import java.util.Scanner;

public class TriangularPark {

    public static double calculateRounds(
            double side1,
            double side2,
            double side3) {

        double perimeter =
                side1 + side2 + side3;

        return 5000 / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter Side 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter Side 3: ");
        double s3 = sc.nextDouble();

        double rounds =
                calculateRounds(s1, s2, s3);

        System.out.println(
                "Rounds Required = "
                        + rounds);
    }
}