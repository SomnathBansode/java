public class C {
    void Demo()
    {
        System.out.print("Demo Hello");
    }
        static void Demo2() {
        System.out.print(" demo2");
    }
    public static void main(String argu[]){
        C ref= new C();
        ref.Demo();
        C.Demo2();
        System.out.println("Hello world");
        System.out.print(argu[0]);
        System.out.print(argu[1]);
        // need to pass value at run the program ex PS D:\JAVA> java C "somnath" "bansode" it will take 0 possition somnath if its 1 then bansode becouse it array of srings
    }
}
