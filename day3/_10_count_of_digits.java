package day3;
import java.util.Scanner;
public abstract class _10_count_of_digits {
    public static void main(String[] args) {
        int num,count=0;
        System.out.println("Enter any number :");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        while (num>0) {
            num=num/10;
            count++;
        }
        System.out.println("number of digits "+ count);
        obj.close();
    }
}
