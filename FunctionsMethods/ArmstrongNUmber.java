import java.util.Scanner;

public class ArmstrongNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // boolean ans = isArmstrong(n);
        System.out.println(isArmstrong(n));

    }

    static boolean isArmstrong(int n) {
        int org = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == org;
    }

}
