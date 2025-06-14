package day3;
import java.util.Scanner;

public class _18_area_of_trangle {
    public static void main(String[] args) {
        double base, height, area;
        Scanner scanner = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter base of the triangle: ");
        base = scanner.nextDouble();

        System.out.print("Enter height of the triangle: ");
        height = scanner.nextDouble();

        // Calculate area
        area = 0.5 * base * height;

        // Print result
        System.out.println("Area of the triangle: " + area);

        scanner.close();
    }
}