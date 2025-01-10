import java.util.Scanner;

public class FahrenheitConversionCelsius {
	    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Enter temperature in Fahrenheit
        double fahrenheitTemperatur = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusConversion = (fahrenheitTemperatur - 32) * 5 / 9;

        // Output the result
        System.out.println("The " + fahrenheitTemperatur +" fahrenheit is "+ celsiusConversion +" celsius.");
    }
}
