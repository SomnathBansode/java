package day3;
import java.util.Scanner;
public class _06_power_of_number {
    public static void main(String[] args) {
    
        System.out.println("Enter any number  ");
        int num,power,result=1;
        Scanner obj = new Scanner(System.in);
         num=obj.nextInt();
            System.out.println("Enter any number for power : ");
                     power=obj.nextInt();
            for(int i=1;i<=power;i++){
                result=num*result;
            }
            System.out.println("Number is "+ num + " power is "+ power +" result is " + result);

        obj.close();
    }
}
