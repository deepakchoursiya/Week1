import java.util.Scanner;

class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        // Declaring an array to store smallest and largest
        int[] result = new int[2];
        // Finding smallest
        result[0] = Math.min(number1, Math.min(number2, number3));
        // Finding largest
        result[1] = Math.max(number1, Math.max(number2, number3));
        // Returning the result
        return result;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for three numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Finding the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Displaying the result
        System.out.println("The smallest number is " + result[0]);
        System.out.println("The largest number is " + result[1]);

        // Closing Scanner class
        input.close();
    }
}
