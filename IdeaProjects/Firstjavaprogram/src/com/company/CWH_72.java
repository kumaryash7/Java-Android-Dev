package com.company;   // DATE ,TIME , AND DATE TIME FORMATTER

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.time.*;

public class CWH_72 {
    public static void main(String[] args) {
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getAvailableIDs()[5]);
        System.out.println(TimeZone.getAvailableIDs()[100]);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df);   // CREATING DATE STRING USING DATE AND FORMAT
        System.out.println(myDate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);


    }
}
