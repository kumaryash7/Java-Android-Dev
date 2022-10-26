package com.company;
class MyThread3 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println(" i am yash the dangerous khiladi");
        }
    }
}

class MyThread33 extends Thread{
   // public void (String name){
       // super(name);
   // }
    public void run(){
        while (true){
            System.out.println(" thank you");
        }
    }
}

public class CWH_52 {
    public static void main(String[] args) {
MyThread3 t1 = new MyThread3();
MyThread33 t2 = new MyThread33();
t1.start();
try {
    t1.join();  // t2 will not run until t1 is finished completely
}
catch (Exception e ){
    System.out.println(e);
}
t2.start();
    }
}
