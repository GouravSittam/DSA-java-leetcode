
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
        sum();
        
    }
    static void sum(){
        System.out.println("Enter the Number you want to add: ");
        Scanner sc = new Scanner (System.in);
        int num1,num2,sum;
        System.out.print("Enter the num1: ");
        num1=sc.nextInt();
        System.out.print("Enter the num2: ");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println(sum);
    }
    
}
