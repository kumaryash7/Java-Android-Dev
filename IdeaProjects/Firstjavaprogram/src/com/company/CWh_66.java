package com.company;

import java.util.Scanner;

public class CWh_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =new int[4];
        for(int i=0;i<4;i++){
            arr[i]= sc.nextInt();

        }

        int storage =0;

        for(int i=0;i<4;i++){
            storage += arr[i];

        }

        System.out.println(storage);
    }
}
