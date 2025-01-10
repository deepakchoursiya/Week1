import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        // Define an array to store the ages of 10 students
        int[] ages = new int[10];
        Scanner sc = new Scanner(System.in);

        // Loop to take input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Loop to check voting eligibility for each student
        for (int age : ages) {
            if (age < 0) // Check for invalid age
                System.out.println("Invalid age");
            else if (age >= 18) // Check if age is 18 or above
                System.out.println("The student with the age " + age + " can vote.");
            else // For ages below 18
                System.out.println("The student with the age " + age + " cannot vote.");
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}