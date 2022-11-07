package com.comarch.obiektowosc.przekazywanie;

public class Cos {
    int add(int a, int b) {
        a = 7;
        b = 10;
        return a+b;
    }

    void cosTamRobie(Cos2 cos2) {
        cos2.x = 15;
    }
}
