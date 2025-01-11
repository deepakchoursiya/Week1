import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public boolean canStudentVote(int age) {
        // Validate if age is a negative number
        if (age < 0) {
            return false; // Age is invalid
        }

        // Check if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create an instance of StudentVoteChecker
        StudentVoteChecker voteChecker = new StudentVoteChecker();
        
        // Array to store the ages of 10 students
        int[] studentAges = new int[10];
        
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);

        // Loop to take age input for all 10 students
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Check if the student can vote and display the result
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
