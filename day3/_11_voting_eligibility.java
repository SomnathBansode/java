package day3;
import java.util.Scanner;;
public class _11_voting_eligibility {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter any age ");
        Scanner obj = new Scanner(System.in);
        age=obj.nextInt();
        String result=(age>18)  ? "Eligible for vote ":"not Eligible for vote ";
        System.out.println(result);
        obj.close();
    }
}
