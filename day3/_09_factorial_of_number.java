package day3;

import java.util.Scanner;

public class _09_factorial_of_number {
    public static void main(String[] args) {
        int a, fact = 1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to find factorial :");
        a = obj.nextInt();

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        obj.close();
    }
}
