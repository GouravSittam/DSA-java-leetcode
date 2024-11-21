// package Conditionals and Loops;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //FInd the largest of 3 numbers
        // int max =a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }

        // //Another method
        int max =0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.println(max);
    }

}
