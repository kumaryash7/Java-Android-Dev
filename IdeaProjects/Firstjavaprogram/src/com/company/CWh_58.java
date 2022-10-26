package com.company;            // CUSTOM EXCEPTION AND ALSO BASIC EXCEPTIONS
class NeagtiveRadiusException extends Exception{
    @Override
    public String toString(){

        return " radius cannot be negative";

    }
    @Override
    public String getMessage(){
        return " radius cannot be negative";

    }
}

public class CWh_58 {
    public static double area(int r) throws NeagtiveRadiusException{
        if (r<0){
            throw  new NeagtiveRadiusException();

        }
        double result = Math.PI*r*r;
        return result;

    }
    public static int divide(int a, int b) throws ArithmeticException{
        int c = a/b;
        return c;

    }
    public static void main(String[] args) {
       try {
           int c = divide(6,0);
           System.out.println(c);
       }
       catch (Exception e){
           System.out.println(" Exception "+ e);

       }
    try {
        double ar = area(6);
        System.out.println(ar);
    }
    catch (Exception e){
        System.out.println(e);
    }


    }
}
