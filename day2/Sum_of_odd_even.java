package day2;

import java.util.Scanner;

public class Sum_of_odd_even {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter Range or number:");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        if (n % 2 == 0) {
            // Sum of even numbers up to n
            for (int i = 0; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("Addition of even numbers up to " + n + " is " + sum);
        } else {
            // Sum of odd numbers up to n
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("Addition of odd numbers up to " + n + " is " + sum);
        }

        obj.close();
    }
}