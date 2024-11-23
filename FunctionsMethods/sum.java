import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // sum();
        // sum();
        int ans = sum2();
        System.out.println(ans);

        int wer=sum3(30,40);
        System.out.println(wer);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String msg = "Hello " + name;
        return msg;
    }

    //pass the value of numbers when you are calling the methods in main()
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }

    // return the sum of two numbers
    static int sum2() {
        System.out.println("Enter the Number you want to add: ");
        Scanner sc = new Scanner(System.in);
        // int num1,num2,sum;
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        System.out.println("Enter the Number you want to add: ");
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter the num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }
}
