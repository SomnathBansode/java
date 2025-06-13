package day2;

import java.util.Scanner;

public class pre_post_incri_decri {

    public static void main(String args[]) {
        int a, b;
        Scanner o = new Scanner(System.in);
        a = o.nextInt();
        b = o.nextInt();
        System.out.println("Enter Two int   ");
        System.out.println("Pre incriments ++a  " + (++a));
        System.out.println("Pre incriments ++a  " + (++a));
        System.out.println("Pre incriments ++b  " + (++b));
        System.out.println("Pre incriments ++b  " + (++b));

        System.out.println("Enter Two int   ");
        System.out.println("Pre decriments --a  " + (--a));
        System.out.println("Pre decriments --a  " + (--a));
        System.out.println("Pre decriments --b  " + (--b));
        System.out.println("Pre decriments --b  " + (--b));
        o.close();
    }
}
