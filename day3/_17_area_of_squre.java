package day3;

import java.util.*;

public class _17_area_of_squre {
    public static void main(String[] args) {
        int side;
                System.out.println("Enter Side value" );
        Scanner obj = new Scanner(System.in);
        side = obj.nextInt();
        System.out.println("Area is " + side * side);
        obj.close();
    }
}
