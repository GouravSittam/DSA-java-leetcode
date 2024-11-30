
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        //Array of primitivs
        int Arr[] = new int[5];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(Arr));
    }
}
