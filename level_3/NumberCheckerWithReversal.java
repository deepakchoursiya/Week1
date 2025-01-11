// Create NumberCheckerWithReversal Class to check palindromes and reverse digits
class NumberCheckerWithReversal {

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

   // Reversing the digits array
   public static int[] reverseDigits(int[] digits) {
      int[] reversed = new int[digits.length];
      for (int i = 0; i < digits.length; i++) {
         reversed[i] = digits[digits.length - 1 - i];
      }
      return reversed;
   }

   // Comparing two arrays for equality
   public static boolean compareArrays(int[] array1, int[] array2) {
      if (array1.length != array2.length) {
         return false;
      }
      for (int i = 0; i < array1.length; i++) {
         if (array1[i] != array2[i]) {
            return false;
         }
      }
      return true;
   }

   // Check if a number is a palindrome
   public static boolean isPalindrome(int number) {
      int[] digits = getDigits(number);
      int[] reversedDigits = reverseDigits(digits);
      return compareArrays(digits, reversedDigits);
   }

   public static void main(String[] args) {
      int number = 121;

      // Check for palindrome
      System.out.println("Is Palindrome: " + isPalindrome(number));

      // Reverse the digits
      int[] digits = getDigits(number);
      int[] reversedDigits = reverseDigits(digits);
      System.out.print("Reversed digits: ");
      for (int digit : reversedDigits) {
         System.out.print(digit + " ");
      }
   }
}
