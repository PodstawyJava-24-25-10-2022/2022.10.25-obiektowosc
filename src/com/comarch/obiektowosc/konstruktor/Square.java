package com.comarch.obiektowosc.konstruktor;

public class Square {
    public int side;
    public int field;
    public int circuit;

    Square(int side, int field, int circuit) {
        this.side = side;
        this.field = field;
        this.circuit = circuit;
    }

    public Square(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = side * 4;
    }

    Square() {}

    void test() {
        System.out.println(this);
    }
}
