package com.company;

import java.util.Scanner;

public class CWH_55 {
    public static void main(String[] args) {
        int [] marks ={ 4, 57, 88};
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the value of index");
        int ind = sc.nextInt();

        try{
            System.out.println(" Welcome to CWH_55");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(" Sorry this index doesnot exist");
                System.out.println(" Exception in level 2 ");
            }
        }
        catch (Exception e ){
            System.out.println(" Exception in level 1 ");
        }
    }
}
