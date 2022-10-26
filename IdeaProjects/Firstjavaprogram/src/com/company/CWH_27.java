package com.company;

class Base2{
    int x;
    public void display(){
        System.out.println("hello everyone");
    }
}

class Derived2 extends Base2{
    public Derived2(){
        System.out.println("hello yash");
    }
}
public class CWH_27 {
    public static void main(String[] args) {
Derived2 d = new Derived2();

    }
}
