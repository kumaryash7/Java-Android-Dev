package com.company;
class A{
    public  int harry(){
        return 4;

    }
    public void meth2(){
        System.out.println(" i am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){      // METHOD OVERRIDING
        System.out.println(" i am method 2 of class B");

    }
}
public class CWH_28 {
    public static void main(String[] args) {
A a = new A();
a.meth2();
B b = new B();
b.meth2();



    }
}
