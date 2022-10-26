package com.company;  // METHODS IS JUST LIKE FUNCTIONS OF C++
 import  java.util.Scanner;

public class CWH_14 {
  static int logic (int x, int y){  // WE NEED TO USE  STATIC  IN JAVA AS BECAUSE THIS IS INSIDE A CLASS AND IS
                       // ACTING LIKE A METHOD OF CLASS
      int z;
      if(x>y){
          z=x+y;

      }
      else {
          z= (x+y)*5;

      }
      return  z;

  }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

  int a= sc.nextByte();
  int b= sc.nextByte();;

  int res = logic(a,b);
        System.out.println(res);
    }
}
