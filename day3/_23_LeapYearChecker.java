package day3;
import java.util.Scanner;

public class _23_LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = false;
        
        // Leap year logic:
        // 1. If year is divisible by 400, it's a leap year
        // 2. Else if year is divisible by 100, it's NOT a leap year
        // 3. Else if year is divisible by 4, it's a leap year
        // 4. Else, it's not a leap year
        
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }
        
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();
    }
}