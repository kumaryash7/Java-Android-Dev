package com.company;
class Y1{
    int a;

    public int getA() {
        return a;
    }

    Y1(int x){
      this.a=x;

    }
}
class Y2 extends Y1 {
    Y2(int c){
        super(c);
    }
}
public class CWh_57 {
    public static void main(String[] args) {
Y2 y = new Y2(5);
        System.out.println(y.getA());
    }
}
