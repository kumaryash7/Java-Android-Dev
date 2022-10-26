package com.company;
import java.util.Scanner;

public class CWH_09 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number please");
       int n= sc.nextInt();

        boolean flag = false;
         for(int i=2;i<n;i++){
             if(n%i==0){
                 flag =true;

             }
         }


  if (flag=true){
      System.out.println(" not a prime no.");

  }
  else if(flag = false){
      System.out.println(" prime number ");
  }

    }
}
