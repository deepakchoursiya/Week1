import java.util.Scanner;

class SpringSeason {

    // Method to check if it is spring season
    public static boolean isSpringSeason(int month, int day) {
        // Checking if the date falls within the spring season
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for month and day
        System.out.print("Enter the month (as an integer): ");
        int month = input.nextInt();

        System.out.print("Enter the day (as an integer): ");
        int day = input.nextInt();

        // Checking if it is spring season
        boolean isSpring = isSpringSeason(month, day);

        // Displaying the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Closing Scanner class
        input.close();
    }
}
