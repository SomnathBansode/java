package day3;

import java.util.Scanner;

public class _15_Area_of_rectangle {
    public static void main(String[] args) {
        int length, breath, area;
        System.out.println("Enter Length and breath ");
        Scanner obj = new Scanner(System.in);
        length = obj.nextInt();
        breath = obj.nextInt();
        area = length * breath;
        System.out.println("Area is " + area);
        obj.close();
    }
}
