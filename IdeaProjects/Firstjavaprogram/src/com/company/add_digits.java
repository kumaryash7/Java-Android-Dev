package com.company;
 import  java.util.Scanner;
public class add_digits {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);


      int num;





    num = sc.nextInt();


          int storage ;
          int sum=1;

while (num>0){
   storage =num%10;

 sum*=storage;




    num/=10;
}
        System.out.println(sum);
    }
}
