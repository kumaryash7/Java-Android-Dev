package com.company;         // ARRAY DEQUEUE


import java.util.ArrayDeque;

public class CWh_96 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 =new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.addLast(78232283);
        // ad1.offerFirst(66);
       // ad1.removeFirst();

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
