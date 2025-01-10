import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Create an integer variable index to reflect the array index, initially 0
        int index = 0;

        // Use a loop to iterate until the number is not equal to 0
        while (number != 0) {
            // Remove the last digit from the number and add it to the array
            digits[index] = number % 10;
            number = number / 10;

            // Increment the index by 1
            index++;

            // If index count equals maxDigit, break out of the loop
            if (index == maxDigit) {
                break;
            }
        }

        // Define variables to store largest and second largest digit, initialize to zero
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array and find the largest and second largest number
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("The largest digit is " + largest + ".");
        System.out.println("The second largest digit is " + secondLargest + ".");

        // Closing scanner class
        input.close();
    }
}
