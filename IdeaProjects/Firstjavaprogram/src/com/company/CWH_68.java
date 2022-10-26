package com.company;     //HASH MAPPING IN JAVA

import java.util.HashSet;

public class CWH_68 {
    public static void main(String[] args) {
        HashSet <Integer> myHashSet = new HashSet<>(6,0.5f);
  myHashSet.add(6);
  myHashSet.add(8);
  myHashSet.add(3);
  myHashSet.add(11);            // 11 is noted only once
  myHashSet.add(11);
  myHashSet.add(5);
        System.out.println(myHashSet);

      //  myHashSet.clone();

    }
}
