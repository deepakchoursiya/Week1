import java.util.Scanner;

class WindChillCalculator {

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Calculating and returning the wind chill temperature
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = input.nextDouble();

        // Calculating the wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying the result
        System.out.println("The wind chill temperature is " + windChill);

        // Closing Scanner class
        input.close();
    }
}
