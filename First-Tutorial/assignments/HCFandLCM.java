import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate HCF using Euclidean algorithm
        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }
        int HCF = a;
        // Calculate LCM using the relationship between HCF and LCM
        int LCM = (num1 * num2) / HCF;

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + HCF);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + LCM);

    }
}
