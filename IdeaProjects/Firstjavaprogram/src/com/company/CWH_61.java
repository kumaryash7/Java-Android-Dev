package com.company;

import java.util.Scanner;

class MyExcept extends Exception{
    public String toSring(){
        return " this is an custom exception";

    }
    public  String getString(){
        return " this exception was made to happen ";

    }
}
public class CWH_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }
        finally {
            System.out.println(" this program is ended");
        }
    }
}
