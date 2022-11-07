package com.comarch.obiektowosc.enkapsulacja;

public class App {
    public static void main(String[] args) {
        Square k1 = new Square(5);

        System.out.println(k1.getSide());
        System.out.println(k1.getField());
        System.out.println(k1.getCircuit());

        k1.setSide(10);

        System.out.println(k1.getSide());
        System.out.println(k1.getField());
        System.out.println(k1.getCircuit());
    }
}
