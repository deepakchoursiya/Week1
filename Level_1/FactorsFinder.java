import java.util.Scanner;

class FactorsFinder {
    public static void main(String[] args) {

        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Initial size of the factors array
        int maxFactor = 10; 
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Adding factor to array
                if (index == maxFactor) {
                    // Doubling the array size if needed
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display result
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Closing Scanner class
        input.close();
    }
}
