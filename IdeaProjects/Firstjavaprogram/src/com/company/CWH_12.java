package com.company;
import  java.util.Scanner;

public class CWH_12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      // int [] marks = new int [5];
     //  marks [0]= 100;
      // marks[1]=70;
     //  marks[4]=80;

     //   System.out.println(marks[4]);

        int [] marks = {10, 20 ,30 ,40 ,50};

        System.out.println(marks.length);  //  GIVES LENGTH OF THE ARRAY

         String [] students = { " yash ", " shubham ", " harry ", " rohan "};

        System.out.println(students.length);

        for( int element : marks){     // PRINTING USING FOR EACH LOOP
            System.out.println(element);
        }
    }
}
