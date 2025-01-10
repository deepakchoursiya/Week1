import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Declaring arrays and variables
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        // take user input
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");

            // Input salary and validate
            while (true) {
                System.out.print("Enter salary: ");
                double salary = input.nextDouble();
                if (salary > 0) {
                    salaries[i] = salary;
                    break;
                } else {
                    System.out.println("Invalid salary. Please enter again.");
                }
            }

            // Input years of service and validate
            while (true) {
                System.out.print("Enter years of service: ");
                double years = input.nextDouble();
                if (years >= 0) {
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid years of service. Please enter again.");
                }
            }
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            // Calculate bonus percentage
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;

            // Calculate bonus and new salary
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display result
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        // Closing Scanner class
        input.close();
    }
}
