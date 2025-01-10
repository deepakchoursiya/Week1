import java.util.Scanner;

class ConvertingFeetToYardsAndMiles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the distance in feet: ");

        double distanceInFeet = scanner.nextDouble();

        double feetToYards = 1.0 / 3.0;
        // 1 yard = 3 feet

        double yardToMiles= 1.0 / 1760.0;
        // 1 mile = 1760 yards

        // Convert the distance
        double distanceInYards = distanceInFeet * feetToYards;

        double distanceInMiles = distanceInYards * yardToMiles;

        // Display the results
        System.out.printf("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
		
		
    }
}
