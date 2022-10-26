package com.company;
import java.util.Scanner;

public class CWH_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("evalauting roots of a quadratic expression");

        System.out.println("enter coefficient of x sqaure");
        int a= sc.nextInt();

        System.out.println("enter coefficient of x");
        int b=sc.nextInt();

        System.out.println("enter constant term");
        int c=sc.nextInt();

        float D= (b*b)-4*a*c;
        System.out.println(D);


    }
}
