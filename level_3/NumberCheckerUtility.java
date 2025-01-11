// Create NumberCheckerUtility Class to perform number-based operations
class NumberCheckerUtility {

   // Find the count of digits in a number
   public static int countDigits(int number) {
      int count = 0;
      while (number > 0) {
         count++;
         number /= 10;
      }
      return count;
   }

   // Store the digits of the number in an array
   public static int[] getDigits(int number) {
      int count = countDigits(number);
      int[] digits = new int[count];
      for (int i = count - 1; i >= 0; i--) {
         digits[i] = number % 10;
         number /= 10;
      }
      return digits;
   }

   // Check if a number is a Duck Number
   public static boolean isDuckNumber(int[] digits) {
      for (int digit : digits) {
         if (digit == 0) {
            return true;
         }
      }
      return false;
   }

   // Check if a number is an Armstrong Number
   public static boolean isArmstrongNumber(int[] digits, int count) {
      int sum = 0;
      for (int digit : digits) {
         sum += Math.pow(digit, count);
      }
      return sum == digitsToNumber(digits);
   }

   // Find the largest and second-largest elements in the digits array
   public static void findLargestAndSecondLargest(int[] digits) {
      int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
      for (int digit : digits) {
         if (digit > largest) {
            secondLargest = largest;
            largest = digit;
         } else if (digit > secondLargest && digit < largest) {
            secondLargest = digit;
         }
      }
      System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
   }

   // Find the smallest and second-smallest elements in the digits array
   public static void findSmallestAndSecondSmallest(int[] digits) {
      int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
      for (int digit : digits) {
         if (digit < smallest) {
            secondSmallest = smallest;
            smallest = digit;
         } else if (digit < secondSmallest && digit > smallest) {
            secondSmallest = digit;
         }
      }
      System.out.println("Smallest: " + smallest + ", Second Smallest: " + secondSmallest);
   }

   // Helper method to convert digits array back to the number
   private static int digitsToNumber(int[] digits) {
      int number = 0;
      for (int digit : digits) {
         number = number * 10 + digit;
      }
      return number;
   }

   public static void main(String[] args) {
      int number = 153;
	  
	  // Displaying all result here.
      System.out.println("Count of digits: " + countDigits(number));

      int[] digits = getDigits(number);

      System.out.println("Is Duck Number: " + isDuckNumber(digits));

      System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, countDigits(number)));

      findLargestAndSecondLargest(digits);

      findSmallestAndSecondSmallest(digits);
   }
}
