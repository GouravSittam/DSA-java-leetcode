import java.util.Scanner;

public class AOcircle {
    public static void main(String[] args) {

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

    }
    
}
