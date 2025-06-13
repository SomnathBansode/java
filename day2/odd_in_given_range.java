package day2;
import java.util.Scanner;
public class odd_in_given_range {

    public static void main(String[] args) {
        int n;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter range ");
        n=obj.nextInt();

        for(int i=1; i<=n;i++ ){
            if (i%2==1) {
                System.out.println("odd numbers "+ i);
            }
        }
           for(int i=1; i<=n;i++ ){
            if (i%2==0) {
                System.out.println("Even Numbers"+i);
            }
        }

        obj.close();
    }
}