package com.company;  // THREAD PRIORITIES
class MyThr1 extends Thread{
     MyThr1(String name){
         super(name);
     }
    public void run(){
         while (true) {


             System.out.println(" i am a thread, hello yash");
         }
    }
}
public class CWh_50 {
    public static void main(String[] args) {
MyThr1 t1 =new MyThr1(" hello yash");
MyThr1 t2= new MyThr1(" hello harry");
MyThr1 t3 =new MyThr1(" hello rohan");
MyThr1 t4 =new MyThr1(" hello lovish");
MyThr1 t5 = new MyThr1(" hello shubham");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t5.start();
        t5.start();


    }
}
