
import java.util.Arrays;
import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 name: ");
        //Array of objects
         String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.print(Arrays.toString(str));
        //modify
        str[1]="rudhu";
        System.out.println(Arrays.toString(str));
    }
}
