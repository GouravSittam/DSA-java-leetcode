import java.util.Scanner;

public class countNums {
    public static void main(String[] args){
        System.out.print("Enter the number you want: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==9){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
