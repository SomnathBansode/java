package day2;

import java.util.Scanner;

public class Sum_of_two_number {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner o = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        a = o.nextInt();
        b = o.nextInt();
        sum = a + b;

        System.out.println("Sum is " + sum);
        o.close();
    }
}
