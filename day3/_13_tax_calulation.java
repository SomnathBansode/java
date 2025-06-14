package day3;

import java.util.*;

public class _13_tax_calulation {
    public static void main(String[] args) {
        int sal;
        double tax;

        System.out.println("Enter Salary :");
        Scanner obj = new Scanner(System.in);
        sal = obj.nextInt();
        if (sal <= 10000) {
            System.out.println(sal + "No tax ");
        } else if (sal > 10000 && sal <= 20000) {
            tax = sal * 0.10;
            System.out.println(sal + "tax of " + tax);
        } else {
            tax = sal * 0.20;
            System.out.println(sal + "tax of " + tax);
        }
        obj.close();
    }
}
