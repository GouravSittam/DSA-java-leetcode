import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the string: ");
        String str = sc.nextLine();

        if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
    
}
