package com.company;
interface Camera{

    void takeSnap();
    void recordVideo();
}
interface Wifi{

    String[] getNetworks();
    void connectToNetwork(String network);

}
class Mycellphone{
     public void callNumber(int phoneNumber){
         System.out.println("calling "+ phoneNumber);

     }
     public void pickCall(){
         System.out.println(" Connecting ...");

     }
}

class MysmartPhone extends Mycellphone implements Wifi,Camera{
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
public class CWH_37 {
    public static void main(String[] args) {
MysmartPhone oneplus = new MysmartPhone();
oneplus.getNetworks();

    }
}
