import java.util.*;
class SimpleInterestCalculation
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int principal = input.nextInt();
		// pricipal amount
		
		int rate = input.nextInt();
		// rate of interest
		
		int time = input.nextInt();
		// time duration
		
		double interest = (principal * rate * time) / 100;
		//calculation of simple Interest
		
		System.out.println("The Simple Interest is " + interest + " for Principal " + principal + " Rate of Interest " + rate + " and Time " + time );
		
		
	}
}
