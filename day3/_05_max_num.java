package day3;
import java.util.Scanner;;
public class _05_max_num {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers ");
         Scanner obj = new Scanner(System.in);
         a=obj.nextInt();
         b=obj.nextInt();
         if (a>b) {
            System.out.println("number "+ a + " is max" );
         } else {
             System.out.println("number "+ b + " is max" );
         }
         obj.close();
    }
}
