package com.company;  // TO DETECT LEAP YEAR
import java.util.Scanner;

public class CWH_11 {
    public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);

  int year;

        System.out.println(" please enter an year");
  year = sc.nextInt();
    if( year %4==0){
        System.out.println(" this is a leap year");
    }

    else{
        System.out.println("this is not a leap year");
    }











    }
}
