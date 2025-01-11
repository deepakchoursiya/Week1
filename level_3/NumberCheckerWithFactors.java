// Create NumberCheckerWithFactors Class to perform factor-related operations
class NumberCheckerWithFactors {

   // Find factors of a number and return them as an array
   public static int[] getFactors(int number) {
      int count = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            count++;
         }
      }

      int[] factors = new int[count];
      int index = 0;
      for (int i = 1; i <= number; i++) {
         if (number % i == 0) {
            factors[index++] = i;
         }
      }
      return factors;
   }

   // Find the greatest factor of a number
   public static int getGreatestFactor(int[] factors) {
      return factors[factors.length - 2]; // Second last factor is the greatest proper factor
   }

   // Find the sum of factors
   public static int sumOfFactors(int[] factors) {
      int sum = 0;
      for (int factor : factors) {
         sum += factor;
      }
      return sum;
   }

   // Find the product of factors
   public static int productOfFactors(int[] factors) {
      int product = 1;
      for (int factor : factors) {
         product *= factor;
      }
      return product;
   }

   // Find the product of cubes of factors
   public static int productOfCubes(int[] factors) {
      int product = 1;
      for (int factor : factors) {
         product *= Math.pow(factor, 3);
      }
      return product;
   }

   // Check if a number is a perfect number
   public static boolean isPerfectNumber(int number, int[] factors) {
      int sum = sumOfFactors(factors) - number; // Exclude the number itself
      return sum == number;
   }

   // Check if a number is an abundant number
   public static boolean isAbundantNumber(int number, int[] factors) {
      int sum = sumOfFactors(factors) - number; // Exclude the number itself
      return sum > number;
   }

   // Check if a number is a deficient number
   public static boolean isDeficientNumber(int number, int[] factors) {
      int sum = sumOfFactors(factors) - number; // Exclude the number itself
      return sum < number;
   }

   // Check if a number is a strong number
   public static boolean isStrongNumber(int number) {
      int sum = 0, temp = number;
      while (temp > 0) {
         sum += factorial(temp % 10);
         temp /= 10;
      }
      return sum == number;
   }

   // Helper method to calculate factorial
   public static int factorial(int num) {
      int fact = 1;
      for (int i = 1; i <= num; i++) {
         fact *= i;
      }
      return fact;
   }

   public static void main(String[] args) {
      int number = 28;

      // Get factors of the number
      int[] factors = getFactors(number);

      // Display factors
      System.out.print("Factors: ");
      for (int factor : factors) {
         System.out.print(factor + " ");
      }
      System.out.println();

      System.out.println("Greatest factor: " + getGreatestFactor(factors));

      System.out.println("Sum of factors: " + sumOfFactors(factors));

      System.out.println("Product of factors: " + productOfFactors(factors));
	  
      System.out.println("Product of cubes of factors: " + productOfCubes(factors));

      // Check for perfect, abundant, and deficient numbers
      System.out.println("Is Perfect Number: " + isPerfectNumber(number, factors));
      System.out.println("Is Abundant Number: " + isAbundantNumber(number, factors));
      System.out.println("Is Deficient Number: " + isDeficientNumber(number, factors));

      // Check for strong number
      System.out.println("Is Strong Number: " + isStrongNumber(number));
   }
}
