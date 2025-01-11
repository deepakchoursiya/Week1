import java.util.Scanner;

class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Declaring an array to store quotient and remainder
        int[] result = new int[2];
        // Calculating quotient
        result[0] = number / divisor;
        // Calculating remainder
        result[1] = number % divisor;
        // Returning the result
        return result;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for number and divisor
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Calculating quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Displaying the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        // Closing Scanner class
        input.close();
    }
}
