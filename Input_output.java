import java.util.Scanner;

class Input_Output {
    public static void main(String args[]) {
        int a;
        String b;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter Integer = ");
        a = obj.nextInt();
        obj.nextLine(); // Consume leftover newline
        
        System.out.println("Got Integer = " + a);
        
        System.out.print("Enter String = ");
        b = obj.nextLine();
        System.out.println("Got String = " + b);
        
        obj.close(); // Proper resource cleanup
    }
}