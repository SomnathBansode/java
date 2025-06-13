package day2;

public class Loop {
    public static void main(String[] args) {
        // While loop countdown
        int n = 100;
        while (n >= 0) {
            System.out.println("Hello world");
            n--;
        }

        // While loop counting up
        int a = 1;
        while (a <= 10) {
            System.out.println("Learn java");
            ++a;
        }

        // Do-while loop
        System.out.println("Do While");
        int d1 = 10;
        do {
            System.out.println("Learn js");
            d1--;
        } while (d1 >= 0);

        // Standard for loop
        for (int b = 1; b <= 10; b++) {
            System.out.println("Learn java1");
        }

        // For-each loop (added)
        System.out.println("\nFor-each loop example:");
        int[] numbers = { 10, 20, 30, 40, 50 }; // Array declaration

        for (int number : numbers) {
            System.out.println("Current number: " + number);
        }

        // Another for-each example with Strings
        System.out.println("\nLanguages:");
        String[] languages = { "Java", "Python", "JavaScript", "C++" };

        for (String lang : languages) {
            System.out.println("I'm learning " + lang);
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}