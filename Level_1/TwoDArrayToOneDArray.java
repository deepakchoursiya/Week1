import java.util.Scanner;

class TwoDArrayToOneDArray {
    public static void main(String[] args) {

        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Declaring and initializing the 2D array
        int[][] matrix = new int[rows][cols];

        // Taking user input for 2D array elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Declaring and initializing the 1D array
        int[] array = new int[rows * cols];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display result
        System.out.println("Elements of the 1D array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Closing Scanner class
        input.close();
    }
}
