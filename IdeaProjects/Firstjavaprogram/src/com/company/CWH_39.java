package com.company;              // INHERITANCE IN INTERFACE
interface sampleInterface{
    void meth1();
    void meth2();

}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}
class MysampleClass implements childSampleInterface{

    public void meth1(){
        System.out.println(" meth1");
    }     // WE NEEDED TO IMPLEMENT METH2 AND METH1 ALSO BECASUE THEY HAD BEEN INHERITED
    public void meth2(){
        System.out.println("meth2");
    }
   public void meth3(){
        System.out.println(" meth3");

    }
    public void meth4(){
        System.out.println(" meth 4");
    }
}
public class CWH_39 {
    public static void main(String[] args) {
MysampleClass msc = new MysampleClass();
msc.meth1();
msc.meth2();
msc.meth3();
msc.meth4();
    }
}
