import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int i=1;
        int count=2;

        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
            count++;


        }
        System.out.println(i);


    }
    
}
