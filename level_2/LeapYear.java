 import java.util.Scanner;

class LeapYear {
    // Method to check if a year is a Leap Year
    public static boolean isLeapYear(int year) {
        
        
        // Leap year conditions: divisible by 4 and not by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt(); // Input year from the user
               
			   if(year <1582)
			   {
				   System.out.println("Enter a year greater than 1582");
				   break;
			   }
			   
        
            // Check if the year is a leap year and print the result
            if (isLeapYear(year)) 
                System.out.println(year + " is a Leap Year.");
             else 
                System.out.println(year + " is not a Leap Year.");
            
       
    }
}
