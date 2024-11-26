import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second value: ");
        double b = sc.nextDouble();

        System.out.println("Enter the operation you want to perform (+, -, *, /, %):");
        char operation = sc.next().charAt(0);

        double result = 0;

        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '*') {
            result = a * b;
        } else if (operation == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else if (operation == '%') {
            if (b != 0) {
                result = a % b;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("The result of " + a + " " + operation + " " + b + " is: " + result);
    }
}
