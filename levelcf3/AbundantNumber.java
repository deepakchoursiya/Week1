import java.util.*;
class AbundantNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// taking number from user
		System.out.println("Enter the number");
		
		int number = sc.nextInt();
		
		// initialize the sum as 0 for storing factors
		int sum = 0;
		
		for(int i=1; i<number; i++)
		{
			if(number%i==0)
			//checkig factors
			sum+=i;
		}
		
		if(sum > number)
		System.out.println(number + " is an abundant number.");
		
		else
		System.out.println(number + " is not an abundant number.");
		
		
		
	}
}