package com.company;

import java.util.Scanner;

public class CWH_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int [3];
        marks[0]=7;
        marks[1]=54;
        marks[2]=6;
        System.out.println(" Enter the array index");
        int ind = sc.nextInt();

        System.out.println(" Enter the number you want to divide with");

        int number = sc.nextInt();
        try {
            System.out.println(" the value at array index is : "+ marks[ind]);

            System.out.println(" the value of array - value/ number is : "+ marks[ind]/number);

        }
        catch (ArithmeticException e){
            System.out.println("some exception occured");
            System.out.println(e);
        }
 catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("some exception occured");
            System.out.println(e);
        }
 catch (Exception e){
            System.out.println("some other exception occured");
            System.out.println(e);
        }


    }
}
