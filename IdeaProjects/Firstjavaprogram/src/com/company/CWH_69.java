package com.company;   // DATE AND TIME IN JAVA

import java.sql.Time;
import java.util.Date;

public class CWH_69 {
    public static void main(String[] args) {
        System.out.println((System.currentTimeMillis())/1000/3600/365/24);
                     // MILLI SECONDS PASSED AFTER 1970
        System.out.println(Long.MAX_VALUE);  // MAXIMUM VALUE STORED IN LONG VALUE

        Date d = new Date();
        System.out.println(d);

    }
}
