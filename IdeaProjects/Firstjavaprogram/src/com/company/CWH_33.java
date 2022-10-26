package com.company;
class One{
    public void meth1(){
        System.out.println(" hello yash");

    }
    public void meth2(){
        System.out.println(" hello yash yash");
    }
}

class Two extends One{
    @Override
    public void meth2(){
        System.out.println(" hello harry");
    }

    public void meth3(){
        System.out.println("  i love to code in java ");
    }
}
public class CWH_33 {
    public static void main(String[] args) {
  One obj = new Two();
  obj.meth2();
    }
}
