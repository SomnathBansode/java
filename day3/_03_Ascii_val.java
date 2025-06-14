package day3;

import java.util.Scanner;

public class _03_Ascii_val {
    public static void main(String[] args) {
        char ch;
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Charactor to get ascii value : ");
        ch = obj.next().charAt(0);
        a = ch;
        System.out.println("Ascii value of char " + ch + " is " + a);
        obj.close();
    }
}
