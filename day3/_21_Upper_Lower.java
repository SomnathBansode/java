package day3;
import java.util.*;;
public class _21_Upper_Lower {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch;
        ch=obj.next().charAt(0);
        System.out.println("Enter Charactor :");
        if (ch >='A' && ch<='Z') {
            System.out.println("character is "+ ch+ " " + Character.toLowerCase(ch));
        }else{
                System.out.println("character is "+ ch+ " " + Character.toUpperCase(ch));
        }
        obj.close();
    }
}
