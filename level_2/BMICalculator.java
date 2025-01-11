import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInM = heightInCm / 100; // Convert height from cm to meters
            // BMI formula: BMI = weight / (height * height)
            double bmi = weight / (heightInM * heightInM);
            data[i][2] = bmi; // Store BMI in the third column of the array
        }
    }

    // Method to determine the BMI status for each person
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        // Create a 2D array to store the weight, height and BMI of 10 people
        double[][] data = new double[10][3]; // 10 rows, 3 columns (weight, height, BMI)
        
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for weight and height of each person
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Get BMI status for each person
        String[] bmiStatus = getBMIStatus(data);

        // Display the results
        System.out.println("\nBMI Report:");
        System.out.println("Person | Weight (kg) | Height (cm) | BMI   | Status");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Person %d | %.2f        | %.2f       | %.2f  | %s\n", 
                              (i + 1), data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
