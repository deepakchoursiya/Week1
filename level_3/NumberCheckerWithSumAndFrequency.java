class NumberCheckerWithSumAndFrequency {

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

   // Find the sum of digits in the number
   public static int sumOfDigits(int[] digits) {
      int sum = 0;
      for (int digit : digits) {
         sum += digit;
      }
      return sum;
   }

   // Find the sum of squares of the digits
   public static int sumOfSquares(int[] digits) {
      int sum = 0;
      for (int digit : digits) {
         sum += Math.pow(digit, 2);
      }
      return sum;
   }

   // Check if a number is a Harshad number
   public static boolean isHarshadNumber(int number, int[] digits) {
      int sum = sumOfDigits(digits);
      return number % sum == 0;
   }

   // Find the frequency of each digit in the number
   public static int[][] findDigitFrequency(int[] digits) {
      int[][] frequency = new int[10][2]; // Columns: digit, frequency
      for (int i = 0; i < 10; i++) {
         frequency[i][0] = i; // Initialize digit column
         frequency[i][1] = 0; // Initialize frequency column
      }
      for (int digit : digits) {
         frequency[digit][1]++;
      }
      return frequency;
   }

   public static void main(String[] args) {
      int number = 1729;

      int[] digits = getDigits(number);

      // Sum of digits
      System.out.println("Sum of digits: " + sumOfDigits(digits));

      System.out.println("Sum of squares of digits: " + sumOfSquares(digits));

      // Check if Harshad number
      System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

      // Find digit frequency
      System.out.println("Digit frequencies:");
      int[][] frequency = findDigitFrequency(digits);
      for (int[] freq : frequency) {
         if (freq[1] > 0) {
            System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
         }
      }
   }
}
