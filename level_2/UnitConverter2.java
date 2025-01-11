public class UnitConverter2{

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Test the methods
        double yards = 5.0;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        
        double feetVal = 15.0;
        double yardsVal = convertFeetToYards(feetVal);
        System.out.println(feetVal + " feet is equal to " + yardsVal + " yards.");
        
        double meters = 2.0;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");
        
        double inchesVal = 24.0;
        double metersVal = convertInchesToMeters(inchesVal);
        System.out.println(inchesVal + " inches is equal to " + metersVal + " meters.");
        
        double inchesToCmVal = 10.0;
        double cmVal = convertInchesToCentimeters(inchesToCmVal);
        System.out.println(inchesToCmVal + " inches is equal to " + cmVal + " centimeters.");
    }
}
