package com.company;         // LINKED LIST

import java.util.LinkedList;

public class CWH_64 {
    public static void main(String[] args) {
LinkedList <Integer> l1 = new LinkedList<>();
LinkedList <Integer> l2 = new LinkedList<>();
l1.add(6);
l1.add(7);
l1.add(5);
l1.add(4);
l1.add(6);
        l1.addLast(60);

      try {
          l1.get(7);
          System.out.println(l1.get(7));
      }
      catch (Exception e ){
          System.out.println(e);
      }
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
