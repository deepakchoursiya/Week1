import java.util.Scanner;

class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Calculating and returning the simple interest
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for principal
        System.out.print("Enter Principal amount: ");
        double principal = input.nextDouble();

        // Taking user input for rate of interest
        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        // Taking user input for time in years
        System.out.print("Enter Time in years: ");
        double time = input.nextDouble();

        // Calculating the simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal 
                           + ", Rate of Interest " + rate + " and Time " + time);

        // Closing Scanner class
        input.close();
    }
}
