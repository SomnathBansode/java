package day3;
import java.util.Scanner;
public class _12_creating_table {
    public static void main(String[] args) {
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number to get Table of that number ");
        num= obj.nextInt();
        for(int i=1;i<=10;i++){
             System.out.println(num + "*"+ i+"=" + num*i );
        }
        obj.close();
    }
}
