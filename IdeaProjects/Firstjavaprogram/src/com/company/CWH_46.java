package com.company;
interface I1{
    public void greet();
    public void dance();

}
interface I2 extends I1{
    public void sing();

    @Override
    void greet();

    @Override
    void dance();
}
class I3 implements I1,I2{
    public void greet(){
        System.out.println(" hello darling");

    }
    public void dance(){
        System.out.println(" i am dancing salsa");

    }
    public void  sing(){
        System.out.println(" lal laa la la la ");
    }
}
public class CWH_46 {
    public static void main(String[] args) {
        I3 i =new I3();
        i.dance();
    }
}
