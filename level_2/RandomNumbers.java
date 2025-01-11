import java.util.Random;

public class RandomNumbers {

    // Method to generate an array of 4-digit random numbers of given size
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];

        // Generate random 4-digit numbers and store them in the array
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Ensures a 4-digit number (1000-9999)
        }

        return numbers;
    }

    // Method to find average, min, and max of the array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3]; // Index 0: average, Index 1: min, Index 2: max
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, min, and max
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number); // Find minimum
            max = Math.max(max, number); // Find maximum
        }

        // Calculate average
        result[0] = sum / numbers.length;
        result[1] = min;
        result[2] = max;

        return result;
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Find the average, min, and max values of the array
        double[] stats = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("\nStatistics:");
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
