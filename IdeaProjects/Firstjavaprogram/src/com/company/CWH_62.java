package com.company;          // JUST PRACTISING METHODS , CLASSES AND INTERFACES
abstract class Q1{
   abstract public  void greet();

}



interface Q3{
    public void dance();

    public int add(int a , int b);

}

class Q2 implements Q3{
    public void dance(){
        System.out.println(" dance salsa dance ");
    }

    public  int add(int a, int b){
        return a+b;

    }
}
public class CWH_62 {
    public static void main(String[] args) {
        Q1 q = new Q1() {
            @Override
            public void greet() {
                System.out.println(" hello everyone my name is yash kumar");
            }
        };
        q.greet();
    }
}
