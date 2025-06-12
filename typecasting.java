public class typecasting {
    public static void main(String args[]){
        //Implicit typecasting
        int a=10;// 4 bytes
        double b=a;//8 bytes
        System.out.print(" Implicit typeCasting = "+b);
        //explisit type casting
        double c = 10.6;//8 bytes
        int d = (int)c;// 4 bytes
        System.out.print(" Explicit typeCasting = "+d);

    }
}
