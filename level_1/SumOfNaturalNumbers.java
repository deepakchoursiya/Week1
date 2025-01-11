import java.util.Scanner;

class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using loop
    public static int findSumOfNaturalNumbers(int n) {
        // Declaring and initializing sum
        int sum = 0;
        // Using loop to calculate the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        // Returning the sum
        return sum;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for n
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Calculating the sum of n natural numbers
        int sum = findSumOfNaturalNumbers(n);

        // Displaying the result
        System.out.println("The sum of the first " + n + " natural numbers is " + sum);

        // Closing Scanner class
        input.close();
    }
}
