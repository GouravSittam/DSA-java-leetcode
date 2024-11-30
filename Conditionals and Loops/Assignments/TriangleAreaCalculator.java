import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");

        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }

}
