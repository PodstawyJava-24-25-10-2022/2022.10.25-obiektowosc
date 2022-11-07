package com.comarch.obiektowosc.enkapsulacja;

public class Square {
    private int side;
    private int field;
    private int circuit;

    Square(int side, int field, int circuit) {
        this.side = side;
        this.field = field;
        this.circuit = circuit;
    }

    Square(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = side * 4;
    }

    Square() {}

    int getSide() {
        return this.side;
    }

    public int getField() {
        return this.field;
    }

    public int getCircuit() {
        return circuit;
    }

    void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = side * 4;
    }
}
