import java.util.Scanner;

class ArraySumCalculator {
    public static void main(String[] args) {

        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Array to store up to 10 elements
        double[] numbers = new double[10];

        // Variables to store the total sum and index
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            // Taking user input
            System.out.print("Enter a number: ");
            double userInput = input.nextDouble();

            // Breaking loop if 0, negative number, or max size reached
            if (userInput <= 0 || index == 10) {
                break;
            }

            // Storing value in array 
            numbers[index] = userInput;
            index++;
        }

        // Calculating the total sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display result
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Displaying the total
        System.out.println("Total Sum: " + total);

        // Closing Scanner class
        input.close();
    }
}
