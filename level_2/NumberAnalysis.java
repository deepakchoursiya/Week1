import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2,
    // 0 if both are equal, or -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check if the number is positive or negative
        // and check if positive, whether it's even or odd
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            if (positivity.equals("positive")) {
                String evenOdd = isEven(numbers[i]);
                System.out.println("Number " + numbers[i] + " is positive and " + evenOdd + ".");
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }

        // Close the scanner
        scanner.close();
    }
}
