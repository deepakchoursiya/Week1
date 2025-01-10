class EarthVolumeCalculation {
    // Compute the volume of Earth in km^3 and miles^3
    public static void main(String[] args) {
		
        
		// Radius of Earth in kilometers
		double earthRadiuskm = 6378.0;
		
		// Calculate the volume of Earth in cubic kilometers
        double volumeInKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiuskm, 3);
		
		// Conversion factor from kilometers to miles
		double kmToMilesConversionFactor = 0.621371;
		
        // Convert radius to miles and calculate the volume in cubic miles
        double radiusInMiles = earthRadiuskm * kmToMilesConversionFactor;
		
		// Calculate the volume of Earth in cubic kilo miles
		double volumeInMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);

        // Display the results
        System.out.printf("The volume of Earth in cubic kilometers is "  + volumeInKm3 + " and in cubic miles is " + volumeInMiles3);
    }
}