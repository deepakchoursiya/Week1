class DiscountFee {
	public static void main(String[] args) {
		
		int fee = 125000, discountPercent = 10;
		
		// Calculate discount amount
	    int discountAmount = (fee*10)/100;
		
		// Calculate discount fee
		int discountedFee = fee - discountAmount;
		
		// Display result
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
		
	}
}