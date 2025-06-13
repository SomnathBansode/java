package day2;

public class Statements {
    public static void main(String[] args) {
        int a = 10, b = 10, marks = 98;
        
        // Simple if statement
        if (a == b) {
            System.out.println("Your age is " + a);
        }
        
        // If-else statement
        if (a > 18) {
            System.out.println("You can drive car");
        }
        else {
            System.out.println("You cannot drive car");
        }

        System.out.println("Else if ladder");
        // Else-if ladder
        if (marks < 35) {
            System.out.println("Fail");
        }
        else if (marks > 35 && marks <= 60) {
            System.out.println("Pass and medium");
        }
        else if (marks > 60 && marks <= 90) {
            System.out.println("Pass and second");
        }
        else {
            System.out.println("Pass and Topper");
        }

        // Nested if-else example
        System.out.println("\nNested if-else example:");
        if (a > 5) {
            System.out.println("a is greater than 5");
            
            if (b > 5) {
                System.out.println("b is also greater than 5");
                
                if (a == b) {
                    System.out.println("a and b are equal");
                }
                else {
                    System.out.println("a and b are not equal");
                }
            }
            else {
                System.out.println("b is 5 or less");
            }
        }
        else {
            System.out.println("a is 5 or less");
        }

        // Switch statement example
        System.out.println("\nSwitch statement example:");
        int dayOfWeek = 3; // Let's say 1=Monday, 2=Tuesday, etc.
        
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Another switch example with marks
        System.out.println("\nSwitch with marks:");
        int gradeCategory = marks / 10; // Convert marks to 10-9, 8, etc.
        
        switch (gradeCategory) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }
    }
}