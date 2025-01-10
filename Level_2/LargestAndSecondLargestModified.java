import java.util.Scanner;

class LargestAndSecondLargestModified {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create an array to store the digits of the number
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Loop to extract digits and store in the array
        while (number != 0) {
            if (index == maxDigit) {
				// Increase the size of the array
                maxDigit += 10;  
                int[] temp = new int[maxDigit];  

                // Copy elements from digits array to temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign temp array to digits
                digits = temp;
            }

            digits[index] = number % 10;  // Store the last digit
            number = number / 10;  // Remove the last digit
            index++;  // Increment index
        }

        // Finding the largest and second largest numbers
        int largest = digits[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Closing scanner class
        input.close();
    }
}
