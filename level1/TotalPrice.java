import java.util.*;
class TotalPrice
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int unitPrice = input.nextInt();
		// unit price of a product
		
		int quantity = input.nextInt();
		//	number of quatity	
		
		int totalPurchase = unitPrice * quantity;
		// total of Purchase
		
		System.out.println("The total purchase price is INR " + totalPurchase + " if the quantity "+ quantity + " and unit price is INR " + unitPrice);
		
		
	}
}
