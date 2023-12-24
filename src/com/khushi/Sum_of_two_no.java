package com.khushi;
import java.util.Scanner;
public class Sum_of_two_no {
    public static void main(String[] args) {
        System.out.println("Enter the two Number :");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;

        System.out.println("Sum of Two Number is:"+sum);

    }
}
