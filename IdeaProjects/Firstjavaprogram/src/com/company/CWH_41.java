package com.company;
import java.util.Scanner;

interface square{
    int  area(int x);
    void properties();

}

class AA implements square{

    public int area( int x){


        return x*x;

    }
    public void properties(){
        System.out.println(" all sides are equal");
        System.out.println(" all angles are right angles");
        System.out.println(" diagonals are equal");
        System.out.println(" diagonals are at right angle");
    }
}
public class CWH_41 {

    public static void main(String[] args) {
        AA s= new AA();
        s.properties();
        System.out.println(s.area(5));

    }
}
