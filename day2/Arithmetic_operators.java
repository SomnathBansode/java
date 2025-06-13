package day2;
import java.util.Scanner;
class Arithmetic_operators{
    public static void main (String args[]){
        int a,b;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter two int values:");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Sum="+ (a+b));
        System.out.println("sub="+ (a-b));
        System.out.println("Multi="+ (a*b));
        System.out.println("Div="+ (a/b));
        System.out.println("Remainder="+ (a%b));
        obj.close();
}
}