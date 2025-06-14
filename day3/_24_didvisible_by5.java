package day3;

import java.util.Scanner;

public class _24_didvisible_by5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
        num = obj.nextInt();

        if (num%5 == 0) {
            System.out.println("Number is Divisible by 5");
        } else {
            System.out.println("Number is not Divisible by 5");
        }
        obj.close();
    }
}
