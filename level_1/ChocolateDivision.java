import java.util.Scanner;

class ChocolateDivision {

    // Method to find chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        // Declaring an array to store chocolates per child and remainder
        int[] result = new int[2];
        // Calculating chocolates per child
        result[0] = numberOfChocolates / numberOfChildren;
        // Calculating remaining chocolates
        result[1] = numberOfChocolates % numberOfChildren;
        // Returning the result
        return result;
    }

    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculating the distribution of chocolates
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Displaying the result
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        // Closing Scanner class
        input.close();
    }
}
