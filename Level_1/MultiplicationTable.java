import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store results
        int[] multiplicationResult = new int[4];

        // Calculating multiplication results from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // Display the result
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        // Closing Scanner class
        input.close();
    }
}
