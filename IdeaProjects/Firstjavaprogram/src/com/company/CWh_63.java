package com.company;        // Arraylist

import java.util.*;

public class CWh_63 {
    public static void main(String[] args) {
ArrayList<Integer> l1 = new ArrayList<>();
ArrayList<Integer> l2 = new ArrayList<>(5);
l2.add(15);
l2.add(18);
l2.add(19);


l1.add(6);
l1.add(7);
l1.add(4);
l1.add(6);
l1.add(5);
l1.add(0,10000);

l1.addAll(l2);
   //      l1.clear();
    //    l1.clone();

for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
      //   System.out.println(l1.contains(10000));
        System.out.println(l1.indexOf(15));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.isEmpty());
        System.out.println(l1.iterator());
      //  System.out.println(l1.hashCode());

    }
}
