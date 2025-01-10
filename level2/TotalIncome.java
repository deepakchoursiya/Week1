import java.util.Scanner;

class TotalIncome {
	public static void main(String[] args) {
		
		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for salary 
		int salary = sc.nextInt();
		
		// Taking user input for bonus
		int bonus  = sc.nextInt();
		
		// Calculate income by adding salary and bonus
		int income = salary + bonus;
		
		// Display result 
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
		
			}
}