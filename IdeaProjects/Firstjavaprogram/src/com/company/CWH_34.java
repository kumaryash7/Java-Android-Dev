package com.company;             // INTERFACES



interface Bicycle{
    int a=40;

    void applyBrake(int decrement);   //
    void speedUp( int increment);     // WE NEED TO IMPLEMENT THESE TWO IN CLASS
         // WE NEED TO IMPLEMENT THESE TWO IN CLASS

}

class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println(" pee pee po po ");
    }
    public void applyBrake( int decrement){
        System.out.println(" Applying brake");
    }

    public void speedUp(int increment){
        System.out.println(" Speeding up");
    }
}
public class CWH_34 {
    public static void main(String[] args) {
        AvonCycle cycleYash= new AvonCycle();
        cycleYash.applyBrake(1);
        System.out.println(cycleYash.a);
    }
}
