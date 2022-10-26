package com.company;
import java.util.Scanner;

public class CWH_07 {
    public static void main(String[] args) {
      //  String name= new String("harry");
        //or directly use
        Scanner sc= new Scanner(System.in);

        String name="harry";
        System.out.println(name);
        int a=6;
        float b=5.44f;

        System.out.printf("the value of a is %d and value of b is %f",a,b);
        System.out.println("     ");
        System.out.format("the value of a is %d and value of b is %f",a,b);
        System.out.println("  ");
        String st=sc.nextLine();
        System.out.println(st);


    }// JUST LIKE PRINTING IN C LANGUAGE
}
