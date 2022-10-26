package com.company;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_number_game{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);


        do {
            System.out.println(" Guess my number :");
            int usernumber =sc.nextInt();
            if(usernumber==myNumber){
                System.out.println(" correct number , you won the game ");

            }else if(usernumber > myNumber){
                System.out.println(" your number is large");

            }else {
                System.out.println(" your number is too small");

            }
        }while (myNumber>=0);

        System.out.println(" my number was "+ myNumber);
    }
}
