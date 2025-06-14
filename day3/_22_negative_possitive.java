package day3;

import java.util.Scanner;

public class _22_negative_possitive {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter No :");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        String result;
        result = (num > 1) ? "possitve number" : "Negative Number";
        System.out.println(num + " is " + result);
        obj.close();
    }
}