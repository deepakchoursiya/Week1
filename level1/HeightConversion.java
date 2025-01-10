import java.util.*;
class HeightConversion
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int heightInCm = input.nextInt();
		// height in centi-meter
		
		double heightInFoot = heightInCm/30.48;
		// height in foot		
		
		double inch = heightInCm / 2.54;
		// height in inches
		
		
		System.out.println("Your height in cms is " + heightInCm + " while in feet is  " + heightInFoot + " and in inches is " + inch);
	}
}