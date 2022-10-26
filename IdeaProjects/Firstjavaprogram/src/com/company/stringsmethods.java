package com.company;
import java.util.Locale;
import java.util.Scanner;

public class stringsmethods {
    public static void main(String[] args) {
        String name= "harry";
        System.out.println(name);
        int value= name.length();  // prints length of string
        System.out.println(value);

        String lcase= name.toLowerCase();  //PRINTS THE STRINGS IN LOWER CASE

        System.out.println(lcase);

        String upcase=name.toUpperCase();  //PRINTS IN UPEER CASE
        System.out.println(upcase);

        String nontrimmed_string ="    Harry     ";
        System.out.println(nontrimmed_string);

        String trimmed_string = nontrimmed_string.trim();  //trim method trims the space at start and last
        System.out.println(trimmed_string);

        System.out.println(name.substring(3));  // PRINTS THE SUBSTRING AFTER THAT INDEX

        System.out.println(name.substring(1,4));

        System.out.println(name.replace( 'r' , 'p'));  // REPLACES OLD CHAR BY A NEW CHAR

        System.out.println(name.startsWith("harr"));

        System.out.println(name.charAt(2));  //GIVES CHARACTER AT THAT INDEX
        System.out.println(name.indexOf('a'));  //GIVES INDEX OF THAT CHARACTER IN THE STRING

        System.out.println(name.equals("harry"));

    }
}
