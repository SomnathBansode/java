package day2;

import java.util.Scanner;;

public class Nth_natuaral_number {

    public static void main(String[] args) {
        int a;
        Scanner o = new Scanner(System.in);
        System.out.println("Enter a Nth Number ");
        a = o.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.println("Number is " + i);
        }
        o.close();
    }

}