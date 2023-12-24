package com.khushi;

import java.util.Scanner;

public class TypeConversion_Casting {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        //Type Conversion
        int num= input.nextInt();
        System.out.println("num :"+num); //if we input a float value it will give an error.
        //Type Casting
        int num1=(int)(26.40f);
        System.out.println("num1 :"+num1);
        //Automatic Conversion
        byte a=9;
        byte b=98;
        byte c=98;
        int d=b/c*a;
        int f=a*b/c;//these expression automatically convert byte to integer
        System.out.println(d);
        System.out.println(f);

      // Example for all
    /*  byte b=42;
      char c='a';
      short s=1024;
      int i=50000;
      float f=5.67f;
      double d=0.1234;
      double result=(f*b)+(i/c)+(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s)+" ");
        System.out.println(result);
*/
    }
}
