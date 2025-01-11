import java.util.Scanner;

class TrigonometricFunctions {

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle to radians
        double radians = Math.toRadians(angle);
        // Declaring an array to store sine, cosine, and tangent
        double[] result = new double[3];
        // Calculating sine
        result[0] = Math.sin(radians);
        // Calculating cosine
        result[1] = Math.cos(radians);
        // Calculating tangent
        result[2] = Math.tan(radians);
        // Returning the result
        return result;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Calculating the trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Displaying the result
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        // Closing Scanner class
        input.close();
    }
}
