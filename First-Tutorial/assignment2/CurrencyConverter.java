import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         double USD=84.29;
        System.out.print("Enter the amount in INR: ");
        double INR = sc.nextDouble();
        double result = INR/USD;
        System.out.println("the amount in usd is : "+result);
    }
    
}
