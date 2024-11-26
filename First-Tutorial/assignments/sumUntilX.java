import java.util.Scanner;

public class sumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Enter the number you want and(X to terminate the program)");
            String input = sc.next();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }
        System.out.println("Sum of all entered numbers is: " + sum);
    }

}
