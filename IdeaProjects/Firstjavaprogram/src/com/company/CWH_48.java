package com.company;
class MyThr extends Thread{
 public MyThr(String name){
        super(name);
    }
    public void run(){
     while (true){
         System.out.println(" i am a thread");
     }
    }
}
public class CWH_48 {
    public static void main(String[] args) {
MyThr t = new MyThr("haary");
   //     t.start();
        System.out.println(" the id of the thread is "+ t.getId());
        System.out.println(" the name of thread is "+ t.getName());
    }
}
