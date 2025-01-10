import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {

        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check each number
        for (int number : numbers) {
            // Checking if the number is positive
            if (number > 0) {
                // Checking if the number is even or odd
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is positive and even.");
                } else {
                    System.out.println("The number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                // Display result
                System.out.println("The number " + number + " is negative.");
            } else {
                // Display result
                System.out.println("The number " + number + " is zero.");
            }
        }

        if (numbers[0] > numbers[4]) {
            System.out.println("The first number " + numbers[0] + " is greater than the last number " + numbers[4] + ".");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first number " + numbers[0] + " is less than the last number " + numbers[4] + ".");
        } else {
            System.out.println("The first number " + numbers[0] + " is equal to the last number " + numbers[4] + ".");
        }

        // Scanner class closed
        input.close();
    }
}
