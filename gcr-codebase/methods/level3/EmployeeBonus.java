import java.util.Scanner;

public class EmployeeBonus {

    static double[][] generateEmployeeData() {

        double[][] employees = new double[10][2];

        for (int i = 0; i < employees.length; i++) {

            employees[i][0] = (int)(Math.random() * 90000) + 10000; // salary
            employees[i][1] = (int)(Math.random() * 10) + 1; // years
        }

        return employees;
    }

    static double[][] calculateBonus(double[][] employees) {

        double[][] result = new double[10][2];

        for (int i = 0; i < employees.length; i++) {

            double salary = employees[i][0];
            double years = employees[i][1];

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }

        return result;
    }

    public static void main(String[] args) {

        double[][] employees = generateEmployeeData();
        double[][] result = calculateBonus(employees);

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("OldSalary\tYears\tBonus\tNewSalary");

        for (int i = 0; i < employees.length; i++) {

            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f\n",
                    employees[i][0],
                    employees[i][1],
                    result[i][0],
                    result[i][1]);

            totalOldSalary += employees[i][0];
            totalBonus += result[i][0];
            totalNewSalary += result[i][1];
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}