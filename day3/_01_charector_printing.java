// Int 20---20
// A --- A
package day3;

import java.util.Scanner;

public class _01_charector_printing {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please Enter Charactor : ");
        Scanner obj = new Scanner(System.in);
        ch = obj.next().charAt(0);
        System.out.println("Charactor is " + ch);
        obj.close();
    }
}