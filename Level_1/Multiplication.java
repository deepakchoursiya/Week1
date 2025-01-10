import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {

        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = input.nextInt();

        // Defining an array to store multiplication results
        int[] multiplicationTable = new int[10];

        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Scanner class closed
        input.close();
    }
}
