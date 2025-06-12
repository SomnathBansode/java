/* Java varables */

class comments1 {
    int a = 10;// Instance variable
    static int b = 20;// static variable

    public static void main(String agrs[]) {
        int c = 30;// local variable
        final int D = 40; // final variable should in capital letter

        comments1 C = new comments1();// object created for instance variable

        System.out.println(C.a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(D);
    }
}
