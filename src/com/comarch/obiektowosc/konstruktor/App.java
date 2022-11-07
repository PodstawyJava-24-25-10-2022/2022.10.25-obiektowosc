package com.comarch.obiektowosc.konstruktor;

public class App {
    public static void main(String[] args) {
        Square square = new Square(5, 25, 20);

        System.out.println(square.side);
        System.out.println(square.field);
        System.out.println(square.circuit);

        Square square2 = new Square(6);

        System.out.println(square2.side);
        System.out.println(square2.field);
        System.out.println(square2.circuit);

        System.out.println(square);
        square.test();

        System.out.println(square2);
        square2.test();
    }
}
