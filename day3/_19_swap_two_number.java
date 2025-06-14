package day3;

import java.util.*;

public class _19_swap_two_number {
    public static void main(String[] args) {
        int num1, num2, temp;
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        System.out.println("Before swap" + num1 + " " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap" + num1 + " " + num2);
        obj.close();
    }
}
