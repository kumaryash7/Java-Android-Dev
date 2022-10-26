package com.company;
import java.util.Scanner;
public class CWH05_takinginput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user ");
        Scanner sc=new Scanner(System.in);// TAKING INPUT FROM KEYBOARD
        System.out.println("enter number 1");
        int a=sc.nextInt();  //TAKING INTEGER INPUT
        System.out.println("enter number 2");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("the sum of the numbers is");
        System.out.println(sum);

        String str=sc.next();  //TAKING STRING INPUT
        System.out.println(str);


        String  str2=sc.nextLine();
        System.out.println(str2);
    }
}
