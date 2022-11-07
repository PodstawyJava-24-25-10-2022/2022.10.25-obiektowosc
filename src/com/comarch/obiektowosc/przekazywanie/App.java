package com.comarch.obiektowosc.przekazywanie;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        Cos cos = new Cos();
        int wynik = cos.add(a,b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(wynik);

        Cos2 cos2 = new Cos2();
        cos2.x = 10;

        cos.cosTamRobie(cos2);

        System.out.println(cos2.x);
    }
}
