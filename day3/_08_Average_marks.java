package day3;
import java.util.Scanner;
public class _08_Average_marks {

    public static void main(String[] args) {
        int a,b,c,d,e,avg;
        System.out.println("Add 5 Subjects marks:");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        d=obj.nextInt();
        e=obj.nextInt();
        avg= (a+b+c+d+e)/5;
        System.out.println("Average of marks is "+ avg);
        obj.close();
    }
}