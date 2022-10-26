package com.company;  // DYNAMIC METHOD DISPATCH
class Phone{

     public void greet(){
         System.out.println(" Good Morning ");
     }
 public void name(){
     System.out.println(" My Name is java in class 1");
 }


}

class Smartphone extends Phone {
    public void swagat(){
        System.out.println(" AApka swagat hai");
    }
    @Override
    public void name(){
        System.out.println(" MY name is java in class 2");
    }


}
public class CWh_29 {
    public static void main(String[] args) {
   Phone obj = new Smartphone();  // YES IT IS ALLOWED
  obj.name();  // OBJECT IS RUN
    }
}
