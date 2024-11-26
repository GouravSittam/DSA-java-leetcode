import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the numbers you want");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("The largest number is "+a);
        }else if(b>a){
            System.out.println("The largest number is "+b);
        }else{
            System.out.println("Both numbers are equal");
        }

    }
    
}
