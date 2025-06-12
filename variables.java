// public class variables {
//     int a = 10;// instance variable;
//     static int b = 10;// satatic variable;

//     void fun() {
//         int c = 30;// local variable
//         System.out.println(c);// loacal
//         System.out.println(variables.b +" "+c);
//            System.out.println(a +" "+c);
//         ++a;
//         ++variables.b;
//         ++c;
//     }

//     public static void main(String args[]) {
//         int d = 40;
//         variables ref = new variables();
//         System.out.println(ref.a);// 10
//         System.out.println(variables.b);// 10
//         /// System.out.println(F.c); its local varable of fun();
//         System.out.println(d);// local variable
//             ref.fun();
//                 ref.fun();

//     }
// }


public class variables {
    // Instance variable: 'a' belongs to each object of the class.
    // Each object has its own copy. Initialized to 10.
    int a = 10;
    
    // Static variable: 'b' belongs to the class, shared by all objects.
    // Only one copy exists in memory. Initialized to 10.
    static int b = 10;

    // Instance method 'fun': Can access instance, static, and local variables.
    void fun() {
        // Local variable: 'c' exists only within this method.
        // Initialized to 30 each time 'fun' is called.
        int c = 30;
        
        // Prints local variable 'c' (30).
        System.out.println(c);
        
        // Prints static variable 'b' and local variable 'c' (e.g., "10 30").
        // 'variables.b' accesses the static variable directly via class name.
        System.out.println(variables.b + " " + c);
        
        // Prints instance variable 'a' and local variable 'c' (e.g., "10 30").
        // 'a' is accessed via 'this' implicitly (this.a).
        System.out.println(a + " " + c);
        
        // Increments instance variable 'a' (e.g., from 10 to 11).
        // Affects only the object calling 'fun'.
        ++a;
        
        // Increments static variable 'b' (e.g., from 10 to 11).
        // Affects the class-level variable, shared by all objects.
        ++variables.b;
        
        // Increments local variable 'c' (e.g., from 30 to 31).
        // Has no effect outside this method since 'c' is local.
        ++c;
    }

    // Main method: Entry point, static, called by JVM.
    public static void main(String args[]) {
        // Local variable: 'd' exists only within 'main'. Initialized to 40.
        int d = 40;
        
        // Create an object of class 'variables'. 'ref' holds reference to it.
        variables ref = new variables();
        
        // Print instance variable 'a' of 'ref' (10).
        // Accessed via object reference.
        System.out.println(ref.a);
        
        // Print static variable 'b' (10).
        // Accessed via class name (preferred for static variables).
        System.out.println(variables.b);
        
        // Note: Cannot access 'c' here because 'c' is local to 'fun'.
        // System.out.println(F.c); // Error: 'F' is undefined, and 'c' is local.
        
        // Print local variable 'd' (40).
        System.out.println(d);
        
        // Call 'fun' on 'ref'. Modifies 'a' (10->11), 'b' (10->11), prints 'c'.
        ref.fun();
        
        // Call 'fun' again on 'ref'. Further modifies 'a' (11->12), 'b' (11->12).
        ref.fun();
    }
}