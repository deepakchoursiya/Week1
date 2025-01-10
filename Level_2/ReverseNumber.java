import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Counting digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        
        // array to store digits
        int[] digits = new int[count];
        int index = 0;
        
        // Store digits in the array
        temp = number;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }
        
        // Creating an array to store the reversed digits
        int[] reversedDigits = new int[count];
        
        // Reversing the digits and storing in reversedDigits array
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }
        
        // Display result
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        
        // Closing scanner class
        input.close();
    }
}
