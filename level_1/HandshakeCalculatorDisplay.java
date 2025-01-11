import java.util.Scanner;

class HandshakeCalculatorDisplay {

    // Method to calculate the maximum number of handshakes
    public static int calculateMaximumHandshakes(int numberOfStudents) {
        // Calculating and returning the number of handshakes
        return numberOfStudents * (numberOfStudents - 1) / 2;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculating the maximum number of handshakes
        int maxHandshakes = calculateMaximumHandshakes(numberOfStudents);

        // Displaying the result
        System.out.println("The number of possible handshakes is " + maxHandshakes);

        // Closing Scanner class
        input.close();
    }
}
