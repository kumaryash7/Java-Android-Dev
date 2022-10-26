package com.company;
class Circle{
    public  int radius;
    Circle(){
        System.out.println(" i am default constructor of circle");
    }
    Circle(int r){
       this.radius=r;


    }
    public double area(){
        return Math.PI*this.radius*this.radius;

    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r , int h){
        super(r);
        System.out.println(" i am cylinder 1 parametrised constructor");
        this.height=h;

    }

    public double volume(){
        return Math.PI*this.radius*this.radius*height;

    }

}
public class CWH_31 {
    public static void main(String[] args) {
Cylinder1 obj =new Cylinder1( 5, 12 );
        System.out.println(obj.volume());

    }
}
