package com.company;

import java.util.Scanner;

public class cWH_60 {
    public static void main(String[] args) {
        // PROBLEM 1
        boolean flag = true;
        int [] marks = new int [3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc= new Scanner(System.in);
        int index;
        int i=0;

        while(flag && i<4){
         try {
             index = sc.nextInt();
             System.out.println(" the value of marks[index] is " + marks[index]);
         }
         catch (Exception e){
             System.out.println(" invalid index");
             i++;


         }
        }
    }
}
