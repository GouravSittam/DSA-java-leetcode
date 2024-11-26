import java.util.Scanner;

public class GreetingMessage{
    public static void main(String[] args) {
        System.out.println("Enter the Greeting Message: ");

        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        System.out.println("The Greeting Message is: " + message);
    }
}