// package SwitchStatements;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here you can get information about fruits by entering their name.");

        System.out.print("Enter the fruit you want:");
        String fruit = sc.next();

        switch (fruit.toLowerCase()) { // Ensure the input is case-insensitive
            case "apple":
                System.out.println("King of Himachal");
                break;
            case "mango":
                System.out.println("King of fruits");
                break;
            case "banana":
                System.out.println("King of iykyk");
                break;
            case "orange":
                System.out.println("King of Vitamin C");
                break;
            default:
                System.out.println("Invalid fruit name");
        }

        System.out.println("Thanks for using our service.");
    }
}
