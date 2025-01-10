import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // arrays to store the age and height 
        int[] age = new int[3];
        double[] height = new double[3];

        // Taking input for age and height of the 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            age[i] = input.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }

        // Find the youngest friend
        int youngestAge = age[0];
        String youngestFriend = "Amar";
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                if (i == 1) youngestFriend = "Akbar";
                else youngestFriend = "Anthony";
            }
        }
        
        // Find the tallest friend
        double tallestHeight = height[0];
        String tallestFriend = "Amar";
        for (int i = 1; i < 3; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                if (i == 1) tallestFriend = "Akbar";
                else tallestFriend = "Anthony";
            }
        }

        // Display result
        System.out.println("The youngest friend is " + youngestFriend + ".");
        System.out.println("The tallest friend is " + tallestFriend + ".");

        // Closing scanner class
        input.close();
    }
}
