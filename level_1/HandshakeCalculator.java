import java.util.Scanner;

class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        // Calculating and returning the number of handshakes
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculating the maximum number of handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Displaying the result
        System.out.println("The maximum number of handshakes is " + handshakes + " among " 
                           + numberOfStudents + " students.");

        // Closing Scanner class
        input.close();
    }
}
