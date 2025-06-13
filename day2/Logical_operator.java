package day2;
import java.util.Scanner;
public class Logical_operator {
    public static void main(String args[]){
        int a,b,c;
        Scanner o = new Scanner(System.in);
        System.out.println("enter three int values ");
        a=o.nextInt();
        b=o.nextInt();
        c=o.nextInt();
        System.out.println("logicle AND");
        System.out.println("(a>b) && (c<b)"+((a>b) && (c<b))) ;
        System.out.println("(a<b) && (c>b)"+((a<b) && (c>b))) ;
        System.out.println("(a==b) && (c==b)"+((a==b) && (c==b))) ;

             System.out.println("logicle OR");
        System.out.println("(a>b) || (c<b)"+((a>b) || (c<b))) ;
        System.out.println("(a<b) || (c>b)"+((a<b) || (c>b))) ;
        System.out.println("(a==b) || (c==b)"+((a==b) || (c==b))) ;

             System.out.println("logicle NOT");
        System.out.println("!(a>b)"+ (!(a>b))) ;
        System.out.println("!(a<b)"+(!(a<b))) ;
        System.out.println("!(c>b)"+(!(c>b))) ;
        o.close();

    }
}
