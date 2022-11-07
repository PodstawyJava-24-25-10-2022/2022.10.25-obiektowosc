package com.comarch.obiektowosc.porownywanie;

import com.comarch.obiektowosc.konstruktor.Square;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Square square1 = new Square(5);
        Square square2 = square1;

        System.out.println(square1 == square2);

        System.out.println(square1.side);
        System.out.println(square1.field);
        System.out.println(square1.circuit);

        System.out.println(square2.side);
        System.out.println(square2.field);
        System.out.println(square2.circuit);

        square1.side = 10;

        System.out.println(square1.side);
        System.out.println(square1.field);
        System.out.println(square1.circuit);

        System.out.println(square2.side);
        System.out.println(square2.field);
        System.out.println(square2.circuit);

        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println(s1.equals(s2));

        s1 = s1 + "XYZ";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);

        String[] tab = new String[10];

        for(int i = 0; i < 10; i++) {
            System.out.println(tab[i]);
        }

        tab[0] = "ABC";
    }
}
