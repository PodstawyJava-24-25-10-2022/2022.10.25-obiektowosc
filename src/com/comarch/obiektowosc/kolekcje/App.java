package com.comarch.obiektowosc.kolekcje;

import java.util.HashSet;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(5);
        lista.add(10);

        System.out.println(lista);

        lista.add(15);
        lista.add(35);

        System.out.println(lista);

        System.out.println(lista.get(2));

        lista.remove(0);

        System.out.println(lista);

        System.out.println(lista);

        int a = 5;
        Integer a2 = 5;

        HashSet<String> zbior = new HashSet<>();

        zbior.add("ABC");
        zbior.add("XYZ");
        zbior.add("ABC");

        System.out.println(zbior);

        for(String s : zbior) {
            System.out.println(s);
        }
    }
}
