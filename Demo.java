public class Demo {
    int a =10;// instance variable
    void fun(){  // non-static method need to create object in main method to access in main or run
        int b=10;// loacl variable
        System.out.println(a+" "+b);// a is accesable because its in scope of class means this.a but not nessesary to write
        ++a;++b;
    }
    public static void main(String[] args) {
        Demo D =new Demo();// object of class used for call or run access non static methods
        D.fun();//call by object becouse it non static method
        D.fun();
    }
}
