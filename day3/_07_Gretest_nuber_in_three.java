package day3;
import java.util.Scanner;

public class _07_Gretest_nuber_in_three {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter three numbers: ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();

        if (a >= b && a >= c) {
            System.out.println("number " + a + " is greatest");
        } else if (b >= a && b >= c) {
            System.out.println("number " + b + " is greatest");
        } else {
            System.out.println("number " + c + " is greatest");
        }

        obj.close();
    }
}