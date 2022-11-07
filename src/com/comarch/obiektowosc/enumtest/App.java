package com.comarch.obiektowosc.enumtest;

public class App {
    public static void main(String[] args) {
        Client c = new Client();
        c.sex = Sex.MEN;

        Client c2 = new Client();
        c2.sex = Sex.WOMEN;
    }
}
