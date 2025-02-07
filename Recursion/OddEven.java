import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Is the number odd? " + isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}