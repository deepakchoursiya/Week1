import java.util.*;

class SumOfNaturalNumbers {

    // Recursive method to find the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        // Compute sums
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Comparison
        if (sumRecursion == sumFormula) {
            System.out.println("Both results are correct and match.");
        } else {
            System.out.println("There is a mismatch in the results.");
        }
    }
}
