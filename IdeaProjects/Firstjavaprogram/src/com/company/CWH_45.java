package com.company;    // CREATING THREAD BY EXTENDING THREAD CLASS
class MyThread extends Thread{
    @Override
    public void run(){
        while (true) {
            System.out.println(" making breakfast");
            System.out.println(" i am happy");
        }    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println(" chatting on whatsapp");
            System.out.println(" i am happy");
        }
    }
}
public class  CWH_45 {
    public static void main(String[] args) {
MyThread t1= new MyThread();
MyThread2 t2 = new MyThread2();
t1.start();
t2.start();
    }
}
