// package Conditionals and Loops;

import java.util.Scanner;

public class multipleConditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int salary = sc.nextInt();

        // int salary=25400;
        if(salary>10000){
            salary = salary +2000;
        }else if(salary>20000){
            salary=salary +1000;
        }else{
            salary=salary+500;
        }
        System.out.println(salary);
    }
}
