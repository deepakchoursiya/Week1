import java.util.*;
class MaximumHandshakes
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int numberOfPeople = input.nextInt();
		// number of people		
				
		int totalHandshake= (numberOfPeople * (numberOfPeople - 1) ) / 2;
		// total number of handshakes
		
		System.out.println("The total number of possible handshakes is " + totalHandshake);
		
		
	}
}
