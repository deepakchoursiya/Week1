import java.util.Scanner;

class OddEvenSeparator {
    public static void main(String[] args) {
        
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Checking for a natural number
        if (number < 1) {
            System.out.println("Error: Please enter a natural number (1 or greater).");
            input.close();
            return;
        }

        // Arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        
        // Index variables for odd and even arrays
        int oddIndex = 0, evenIndex = 0;

        // Using a for loop 
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
				// Adding to even array
                evenNumbers[evenIndex++] = i; 
            } else {
				// Adding to odd array
                oddNumbers[oddIndex++] = i; 
            }
        }

        // Display result
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        // Closing Scanner class
        input.close();
    }
}
