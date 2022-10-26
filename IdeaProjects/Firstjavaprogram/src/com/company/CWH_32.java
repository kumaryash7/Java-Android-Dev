package com.company;
 abstract class Parent {
    public Parent(){
        System.out.println(" Mai parent class ka constructor hoon");
    }
    public  void sayHello(){
        System.out.println(" Hello");

    }
 abstract public void greet();  // CAN BE DECLARED AS OUR NEED ANY TIME IN OUR INHERITANCE


}

class Child extends Parent{
     @Override
     public void greet(){
         System.out.println(" Good Morning ");
     }


}
public class CWH_32 {
    public static void main(String[] args) {
Child c= new Child();
c.greet();
    }
}
