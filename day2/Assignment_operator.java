package day2;

public class Assignment_operator {
    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println(a);// 10
        System.out.println(a += 10);// 20
        System.out.println("ternary operator");
        int b = 30, c = 40;
        int max = (b > c) ? b : c;
        System.out.println(max);
        System.out.println("Bitwise operator");

        System.out.println("AND " + (a & b));
        System.out.println("OR " + (a | b));
        System.out.println("XOR " + (a ^ b));
        System.out.println("Complement " + (~a));

    }

}
