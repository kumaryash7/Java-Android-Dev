package com.company;  // CONSTRUCTORS IN INHERITNACE
class  Base1{
  public  int x;
   Base1(){
       System.out.println(" i am constructor");
   }
    Base1(int a){
        System.out.println(" i am a overloaded constructor");
    }

}
class Derived1 extends Base1{
 public  int y;
  Derived1(){
      super(0);          // SUPER KEYWORD
      System.out.println(" i am a derived class constructor");
  }





}
class ChildofDerived extends Derived1{

    public ChildofDerived() {
        System.out.println(" i am a child of derived constructor");
    }
    public  ChildofDerived(int x, int y, int z){
        System.out.println(" i am an overloaded child of derived class constructor"+ z);

    }
}
public class CWH_25 {
    public static void main(String[] args) {
  Base1 b = new Base1();
  Derived1 d =new Derived1();  // the constructor of derived class is again run
        ChildofDerived yash = new ChildofDerived(4,5,2);

    }
}
