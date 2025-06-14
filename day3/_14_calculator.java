package day3;
import java.util.*;
public class _14_calculator {
    public static void main(String[] args) {
        int num1,num2,result,ch;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        num1=obj.nextInt();
        num2=obj.nextInt();
                System.out.println("Enter choice 1.add 2.sub 3.multi 4.divi ");
        ch=obj.nextInt();
        if (ch==1) {
            result=num1+num2;
            System.out.println("Addition" + result);
        }else if (ch==2) {
               result=num1-num2;
            System.out.println("Substraction" + result);
        }else if (ch==3) {
               result=num1*num2;
            System.out.println("Multiplication" + result);
        }
        else if (ch==4) {
               result=num1/num2;
            System.out.println("Divison" + result);
        }else{
          
            System.out.println("Enter valid choice");
        }

        obj.close();
    }
}
