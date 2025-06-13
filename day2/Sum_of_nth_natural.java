package day2;

import java.util.Scanner;

public class Sum_of_nth_natural {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number ");
        a = obj.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        obj.close();
    }
}