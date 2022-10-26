package com.company;

public class CWH_16 {   // VARIABLE ARGUMENTS
    static  int sum( int ...arr){ // AVAILABLE AS AN INTEGER ARRAY
        int result =0;
        for( int a: arr){  // FOR EACH LOOP TO TRAVERSE ARRAY
            result+=a;

        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(" the sum of 2 3 4 and 5 is ");
        System.out.println(sum(2,3,4,5));
    }
}
