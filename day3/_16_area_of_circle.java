package day3;

import java.util.*;

public class _16_area_of_circle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
           System.out.println("Enter number");
        double pi = 3.14;
        int r;
        r = obj.nextInt();

        System.out.println("Area of circle" + pi * r * r);
        obj.close();
    }
}
