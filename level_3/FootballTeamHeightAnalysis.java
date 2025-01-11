// Create FootballTeamHeightAnalysis Class to analyze heights of football team players
import java.util.Random;

class FootballTeamHeightAnalysis {
   // Generate random heights for 11 players between 150 and 250 cm
   public int[] generateHeights() {
      Random random = new Random();
      int[] heights = new int[11];
      for (int i = 0; i < heights.length; i++) {
         heights[i] = random.nextInt(101) + 150; // Generate height between 150 and 250
      }
      return heights;
   }
   // Calculate the sum of all heights
   public int calculateSum(int[] heights) {
      int sum = 0;
      for (int height : heights) {
         sum += height;
      }
      return sum;
   }

   // Calculate the mean height of players
   public double calculateMean(int sum, int numberOfPlayers) {
      return (double) sum / numberOfPlayers;
   }
   // Find the shortest height among players
   public int findShortestHeight(int[] heights) {
      int shortest = Integer.MAX_VALUE;
      for (int height : heights) {
         if (height < shortest) {
            shortest = height;
         }
      }
      return shortest;
   }

   // Find the tallest height among players
   public int findTallestHeight(int[] heights) {
      int tallest = Integer.MIN_VALUE;
      for (int height : heights) {
         if (height > tallest) {
            tallest = height;
         }
      }
      return tallest;
   }

   public static void main(String[] args) {
      FootballTeamHeightAnalysis team = new FootballTeamHeightAnalysis();

      // Generate random heights for the players
      int[] heights = team.generateHeights();

      // Calculate the sum, mean, shortest, and tallest height
      int sum = team.calculateSum(heights);
      double mean = team.calculateMean(sum, heights.length);
      int shortest = team.findShortestHeight(heights);
      int tallest = team.findTallestHeight(heights);

      // Display the results
      System.out.println("Heights of players: ");
      for (int height : heights) {
         System.out.print(height + " ");
      }
      System.out.println("\nSum of heights: " + sum);
      System.out.println("Mean height: " + mean);
      System.out.println("Shortest height: " + shortest);
      System.out.println("Tallest height: " + tallest);
   }
}
