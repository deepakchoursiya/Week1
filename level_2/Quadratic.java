import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
        double[] roots = new double[0]; // Default empty array for no real roots
        
        // Check if delta is positive, zero, or negative
        if (delta > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            roots = new double[] {root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            roots = new double[] {root};
        }
        // If delta is negative, no real roots (empty array remains)
        
        return roots;
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take inputs for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find the roots using the findRoots method
        double[] roots = findRoots(a, b, c);

        // Display the result
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
