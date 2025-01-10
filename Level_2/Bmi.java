import java.util.Scanner;

class Bmi {
    public static void main(String[] args) {
        // Define a scanner to take input
        Scanner sc = new Scanner(System.in);

        // Take the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        // Arrays to store weight, height, BMI, and weight status of persons
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        // Loop to take input for weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter the height (in meters) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            // Calculate the BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine the weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nPerson Details:");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " m");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println("------------------------------------------------------");
        }

        // Closing scanner class
        sc.close();
	}
}