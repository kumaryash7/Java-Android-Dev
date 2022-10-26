package com.company;

public class CWH_15 {
    static  void  change( int a){
        a=98;

    }
    static  void  change2(int [] arr){
        arr[0]=98;

    }
    public static void main(String[] args) {
        int [] arr = { 52 , 72, 80 ,90,100};

        change2(arr);
        System.out.println("the value of arr[0] changes to " + arr[0]);  // AS REFERENCE IS COPIED
                                                                         // OBJECT IS NOT COPIED BUT REFERENCE ID COPIED
    }
}
