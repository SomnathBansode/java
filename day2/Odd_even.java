package day2;
import java.util.Scanner;
public class Odd_even {
    public static void main(String[] args) {
        int a;
        Scanner o =new Scanner(System.in);
           System.out.println("Give Number to check odd or even: ");    
        a=o.nextInt();
        if (a%2==0) 
        {
        System.out.println("Num is even "+ a);    
        }else{
                System.out.println("Num is odd "+ a); 
        }
        o.close();
    }
    
}
