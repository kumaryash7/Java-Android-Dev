package com.company;      // POLYMORPHISM IN INTERFACES
interface Camera2{

        void takeSnap();
        void recordVideo();
}
interface Wifi2{

        String[] getNetworks();
        void connectToNetwork(String network);

}
class Mycellphone2{
        public void callNumber(int phoneNumber){
                System.out.println("calling "+ phoneNumber);

        }
        public void pickCall(){
                System.out.println(" Connecting ...");

        }
}

class MysmartPhone2 extends Mycellphone implements Wifi2,Camera2{
        public   void takeSnap(){
                System.out.println(" taking snap");
        }
        public void recordVideo(){
                System.out.println(" recording ..");
        }
        public void connectToNetwork(String network){
                System.out.println(" connecting "+ network);
        }
        public String [] getNetworks(){
                System.out.println(" Getting list of networks");
                String [] networkList = { " harry", " rohan "," jio"};
                return networkList;

        }
}
public class CWH_40 {
        public static void main(String[] args) {
                Camera2 cam2 = new MysmartPhone2();
                cam2.recordVideo();
        }
}
