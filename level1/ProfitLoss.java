class ProfitLoss
{
	public static void main(String args[])
	{	
		int costPrice = 129;
		// cost price of an article
		
		int sellingPrice = 191;
		// selling price of an article
		
		int profit = sellingPrice - costPrice;
		// calculation of profit
		
		float profitPercentage = ( (float)profit/(float)costPrice ) * 100;
		
		System.out.println(" The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice );
		System.out.println(" The Profit in INR is " + profit + " and the Profit percentage is " + profitPercentage);

	}
}