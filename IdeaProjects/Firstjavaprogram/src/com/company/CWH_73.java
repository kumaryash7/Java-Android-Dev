package com.company;

import java.io.*;
import java.util.Scanner;

public class CWH_73 {
    public static void main(String[] args) {
    //    File myFile = new File("cwh111file.txt");
    //   try {
           // CODE TO CREATE A FILE
     //      myFile.createNewFile();
   //    }
    //   catch (Exception e ){
    //       System.out.println(e);
    //       e.printStackTrace();
    //       System.out.println(" unable to create this file");
    //   }

        // CODE TO WRITE TO A FILE

        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write(" This is our first file from our java source \n Okay now bye bye saou nara");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       File myFile = new File("cwh111file.txt");
        try {
     Scanner sc= new Scanner(System.in);
     while(sc.hasNextLine()){
         String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
