// Create OTPGenerator Class to generate unique 6-digit OTPs
class OTPGenerator {

   // Generate a 6-digit OTP
   public static int generateOTP() {
      return (int) (Math.random() * 900000) + 100000;
   }

   // Check if the generated OTPs are unique
   public static boolean areOTPsUnique(int[] otps) {
      for (int i = 0; i < otps.length; i++) {
         for (int j = i + 1; j < otps.length; j++) {
            if (otps[i] == otps[j]) {
               return false;
            }
         }
      }
      return true;
   }

   public static void main(String[] args) {
      int[] otps = new int[10];

      // Generate 10 unique OTPs
      for (int i = 0; i < 10; i++) {
         otps[i] = generateOTP();
         System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
      }

      // Check if OTPs are unique
      System.out.println("Are OTPs Unique: " + areOTPsUnique(otps));
   }
}
