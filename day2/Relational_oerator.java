package day2;

import java.util.Scanner;

public class Relational_oerator {
    public static void main(String args[]) {
        int a = 20, b = 10;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers...");
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("true/false a>b " + (a > b));
        System.out.println("true/false a<b " + (a < b));
        System.out.println("true/false a<=b " + (a <= b));
        System.out.println("true/false a>=b " + (a >= b));
        System.out.println("true/false a==b " + (a == b));
        System.out.println("true/false a!=b " + (a != b));
        obj.close();
    }
}
