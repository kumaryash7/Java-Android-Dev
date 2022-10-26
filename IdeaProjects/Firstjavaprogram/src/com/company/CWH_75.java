package com.company;
   class MyThreadd extends Thread{
   public void run(){
       while (true){
           System.out.println("Run,Run,Run");
       }
   }
   public void sing(){
       while (true){
           System.out.println("Sing,Sing,sing");
       }
   }

 }
public class CWH_75 {
    public static void main(String[] args) {
         MyThreadd t = new MyThreadd();
         t.start();
    }
}
