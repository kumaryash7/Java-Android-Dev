package com.company;
import java.util.Locale;
import java.util.Scanner;

public class CWH_08 {
    public static void main(String[] args) {

        // PROBLEM 1
        Scanner sc= new Scanner(System.in);
         String name =" Jack Parker ";

         name= name.toLowerCase(Locale.ROOT);
        System.out.println(name);

        // PROBLEM 2
        String text =" To Lower Case";

        text = text.replace(" ", " _");
        System.out.println(text);

        // PROBLEM 3

        String yash= " this string contains    double and  triple spaces";
        System.out.println(yash.indexOf("  "));
    }
}
