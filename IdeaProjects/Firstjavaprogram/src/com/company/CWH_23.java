package com.company;
class Base{

    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printme(){
        System.out.println("i am super hero");

    }
}


class Derived extends Base{


}



public class CWH_23 {
    public static void main(String[] args) {
  Derived yash= new Derived();
  yash.printme();

  yash.setX(5);
        System.out.println(yash.getX());


    }
}
