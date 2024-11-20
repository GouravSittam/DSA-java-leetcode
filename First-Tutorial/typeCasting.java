import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        // TypeCasting
        int num2 = (int) (668.33f);
        System.out.println(num2);

        // Automatic Type Promotion in Expressions
        int a = 257;
        byte b = (byte) (a); // 257%256=1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c * d / e;
        System.out.println(f);

        // byte b= 50;
        // b=b*2; // Error

        int number = 'A';
        System.out.println(number);

        byte x = 42;
        char y = 'a';
        short z = 1032;
        int ans = 489843;
        float w = 4.533f;
        double v = 0.30903;
        double result = (w * x) + (y / z) - (v * ans);
        System.out.println((w * x) +  (ans / y) - (v - z));
        System.out.println(result);

    }

}
