import java.util.*;
class WeightConverter
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int weightInPound = input.nextInt();
		//weight In Pound
		
		float weightInKg = weightInPound * 2.2f;
		//conversion of pound to kg
		
		System.out.println("The weight of the person in pound is " + weightInPound + " and in kg is " + weightInKg);
		
		
		
	}
}
