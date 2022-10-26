package com.company;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("enter maths marks");
        float maths = sc.nextFloat();

        System.out.println("enter physics marks");
       float physics= sc.nextFloat();

        System.out.println("enter chemistry marks");
        float chemistry= sc.nextFloat();

        System.out.println("enter english marks");
        float english= sc.nextFloat();

        System.out.println("enter phe marks");
        float phe=sc.nextFloat();



        float sum = maths+phe+physics+chemistry+english;

        System.out.println("the sum is ");
        System.out.println(sum);

        float percentage= sum/5;

        System.out.println("your percentage is ");
        System.out.println(percentage);

    }
}
