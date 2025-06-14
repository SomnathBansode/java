package day3;

import java.util.Scanner;

public class _20_swap_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two numbers ");
        int a, b;
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Before Swap " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap " + a + " " + b);
        obj.close();
    }
}
