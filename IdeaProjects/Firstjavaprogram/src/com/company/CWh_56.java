package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public  String toString(){
        return super.toString()+ " i am toSTring()";
    }
    public String getMessage(){
        return super.getMessage() + " I  am getMessage()";
    }
}
public class CWh_56 {
    public static void main(String[] args) {
int a;

        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();

if (a<99){
    try
    {
        throw new MyException();
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    System.out.println(" finished");
}
    }
}