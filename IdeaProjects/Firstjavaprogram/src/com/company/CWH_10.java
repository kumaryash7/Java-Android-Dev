package com.company;
import java.util.Scanner;  // SWITCH CASE STATEMENTS

public class CWH_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);

    int age;

    age= sc.nextInt();

    switch (age%2) {

        case 1:
            System.out.println(" number is odd ");
            break;

        case 0:
            System.out.println(" this is an even number ");
            break;
    }
    }
}
