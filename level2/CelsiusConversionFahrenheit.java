import java.util.Scanner;

public class CelsiusConversionFahrenheit {
	// Temperatur Conversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Enter temperature in Celsius
        double celsiusTemperatur = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitTemperatur = (celsiusTemperatur * 9 / 5) + 32;

        // Output the result
        System.out.println("The " + celsiusTemperatur + " Celsius is " + fahrenheitTemperatur + " Fahrenheit.");

        
    }
}
