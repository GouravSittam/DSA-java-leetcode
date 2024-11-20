import java.util.Scanner;

public class Tempature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp in Celsius: ");
        float tempC = sc.nextFloat();
        float tempF = (tempC * 9 / 5) + 32;
        System.out.println("Temp in feranheit is: " + tempF);

    }
}