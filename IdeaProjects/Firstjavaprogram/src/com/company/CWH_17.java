package com.company;
import java.util.Scanner;

public class CWH_17 {
     static void pattern( int n){
         for( int row =0;row<n-1;row++){
            for (int col= 0;col<row+1;col++){
                 System.out.println("*");
             }
             System.out.println(" ");
         }
     }

    public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
int a= sc.nextInt();

      pattern(a);
    }
}
