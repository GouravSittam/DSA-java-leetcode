import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = num1.nextInt();
        System.out.print("Enter the Second number: ");
        int number2 = num2.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of two number is: " + sum);

    }

}
