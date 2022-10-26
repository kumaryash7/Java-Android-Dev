package com.company;        // REVERSE A NUMBER

import java.util.Scanner;

public class CWH_67 {
    public static void main(String[] args) {
        int number ;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

          while (number>0){
              int dig = number%10;
              number /=10;
              System.out.print(dig);
          }
        }
    }

