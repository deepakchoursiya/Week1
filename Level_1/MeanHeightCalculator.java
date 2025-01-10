import java.util.Scanner;

class MeanHeightCalculator {
    public static void main(String[] args) {
        
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Array to store heights of players
        double[] heights = new double[11];
        double sum = 0;

        // Taking user input 
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = input.nextDouble(); 
            heights[i] = input.nextDouble(); 
            heights[i] = input.nextDouble(); 
			// Adding height to the sum
            sum += heights[i]; 
        }

        // Calculating mean height
        double meanHeight = sum / 11;

        // Display result
        System.out.println("Mean height of the football team: " + meanHeight);

        // Closing Scanner class
        input.close();
    }
}
