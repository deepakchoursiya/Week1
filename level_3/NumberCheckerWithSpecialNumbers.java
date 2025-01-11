// Create NumberCheckerWithSpecialNumbers Class to check number properties
class NumberCheckerWithSpecialNumbers {

   // Check if a number is prime
   public static boolean isPrime(int number) {
      if (number <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(number); i++) {
         if (number % i == 0) {
            return false;
         }
      }
      return true;
   }

   // Check if a number is neon
   public static boolean isNeonNumber(int number) {
      int square = number * number;
      int sum = 0;
      while (square > 0) {
         sum += square % 10;
         square /= 10;
      }
      return sum == number;
   }

   // Check if a number is a spy number
   public static boolean isSpyNumber(int number) {
      int sum = 0, product = 1;
      while (number > 0) {
         int digit = number % 10;
         sum += digit;
         product *= digit;
         number /= 10;
      }
      return sum == product;
   }

   // Check if a number is automorphic
   public static boolean isAutomorphicNumber(int number) {
      int square = number * number;
      return String.valueOf(square).endsWith(String.valueOf(number));
   }

   // Check if a number is buzz
   public static boolean isBuzzNumber(int number) {
      return number % 7 == 0 || number % 10 == 7;
   }

   public static void main(String[] args) {
      int number = 25;

      // Print result 
      System.out.println("Is Prime: " + isPrime(number));
      System.out.println("Is Neon: " + isNeonNumber(number));
      System.out.println("Is Spy: " + isSpyNumber(number));
      System.out.println("Is Automorphic: " + isAutomorphicNumber(number));
      System.out.println("Is Buzz: " + isBuzzNumber(number));
   }
}
