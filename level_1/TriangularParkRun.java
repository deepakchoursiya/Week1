import java.util.Scanner;

class TriangularParkRun {

    // Method to calculate the number of rounds needed
    public static double calculateRounds(double side1, double side2, double side3) {
        // Calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        // Calculating and returning the number of rounds
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for the three sides of the triangle
        System.out.print("Enter the length of side 1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side 2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side 3 in meters: ");
        double side3 = input.nextDouble();

        // Calculating the number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Displaying the result
        System.out.println("The athlete needs to complete " + Math.ceil(rounds) 
                           + " rounds to complete a 5 km run.");

        // Closing Scanner class
        input.close();
    }
}
