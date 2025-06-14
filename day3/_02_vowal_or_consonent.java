package day3;
import java.util.Scanner;
public class _02_vowal_or_consonent {
    public static void main(String[] args) {
        char ch;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter charactor ");
        ch=obj.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i'|| ch =='o' || ch=='u'||
        ch=='A' || ch=='E' || ch=='I'|| ch =='O' || ch=='U'
        ) {
            System.out.println("vowal");
        }else{
               System.out.println("Consonent");
        }
        obj.close();
    }
}
