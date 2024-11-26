import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle amount (P):");
        double P = sc.nextDouble();

        System.out.print("enter the value oe rate of interest (R):");
        double R = sc.nextDouble();

        System.out.print("Enter the time period in years (T):");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;

        System.out.println("The Simple Interest is: " + SI);

    }

}
