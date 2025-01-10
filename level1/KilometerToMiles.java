class KilometerToMiles
{
	public static void main(String args[])
	{	
		float oneUnitInMiles= 1.6f;
		// one km is equal to 1.6 miles
		
		float distance = 10.8f;
		// distance in km
		
		float distanceInMiles = distance * oneUnitInMiles ;
		// conversion of km to miles
		
		System.out.println(" The distance " + distance + " Km in miles is " + distanceInMiles);
	}
}