public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Test the methods
        double fahrenheit = 100.0;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
        
        double celsiusVal = 37.0;
        double fahrenheitVal = convertCelsiusToFahrenheit(celsiusVal);
        System.out.println(celsiusVal + " Celsius is equal to " + fahrenheitVal + " Fahrenheit.");
        
        double pounds = 150.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
        double kilogramsVal = 70.0;
        double poundsVal = convertKilogramsToPounds(kilogramsVal);
        System.out.println(kilogramsVal + " kilograms is equal to " + poundsVal + " pounds.");
        
        double gallons = 10.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
        
        double litersVal = 25.0;
        double gallonsVal = convertLitersToGallons(litersVal);
        System.out.println(litersVal + " liters is equal to " + gallonsVal + " gallons.");
    }
}
