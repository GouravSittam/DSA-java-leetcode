import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true) {
            // take the operator as input
            System.out.print("Enter the Operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.println("Enter two numbers: ");
                System.out.print("enter the first number: ");
                
                int num1 = sc.nextInt();
                System.out.print("enter the second number: ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '%') {
                    ans = num1 % num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;  // Skip printing the answer if division by zero
                    }
                }
                System.out.println("The Solution is: "+ans);
            } else {
                System.out.println("Invalid Operator");
            }
        }
    }
}
