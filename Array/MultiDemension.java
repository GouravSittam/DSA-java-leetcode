import java.util.Arrays;
import java.util.Scanner;

public class MultiDemension {
    public static void main(String[] args) {
        /*
         * 123
         * 123
         * 234
         * 342
         * 242
         */
        Scanner in = new Scanner(System.in);
        // int[][] arr = new int[3][];

        // int[][] arr = {
        //         { 1, 2, 3, 4 }, // oth index
        //         { 12, 42, 1212 }, // 1st index
        //         { 123, 32, 12, 2, 2 } // 2nd index -> arr2d[2]= {123,32,12,2,2}
        // };

        int [][] arr = new int[3][3];
        System.out.println(arr.length);//no of rows


        // input
        for (int row = 0; row < arr.length; row++) {
            // for each column in the row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            } 
        }

        //output
        // for (int row = 0; row < arr.length; row++) {
        //     // for each column in the row
        //     for (int col = 0; col < arr[row].length; col++) {
        //         arr[row][col] = in.nextInt();
        //         System.out.println(arr[row][col] + " ");
        //     } 
        //     System.out.println();
        // }

        //output
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }

}
