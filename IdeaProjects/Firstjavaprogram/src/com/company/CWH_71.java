package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class CWH_71 {
    public static void main(String[] args) {
      //  LinkedList<String> l1 = new LinkedList<>();

      //  l1.add(" hello my name is yash");
      //  l1.addLast(" i am from patna");
      //  l1.add(" i am currently pursuing b tech");
      //  System.out.println(l1);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.HOUR_OF_DAY);
        System.out.println(c.DATE);
        System.out.println((c.get(Calendar.HOUR_OF_DAY)) + ":" + c.get(Calendar.MINUTE)+":"+ c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
    }
}
