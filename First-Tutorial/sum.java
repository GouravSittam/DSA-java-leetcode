import java.util.Scanner;

public class sum {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int num1=input.nextInt();
        System.out.print("Enter the second value: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is: "+sum);


     }
}
