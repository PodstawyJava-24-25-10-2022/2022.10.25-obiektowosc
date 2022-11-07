package com.comarch.obiektowosc;

public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    int add(int pierwszaLiczba, int drugaLiczba) {
        //int wynik = pierwszaLiczba + drugaLiczba;
        return pierwszaLiczba + drugaLiczba;
    }

    double add(double a, double b) {
        return a+b;
    }

    void powiedzSwojeImie() {
        System.out.println(name);
    }

    int cos() {
        return 5;
    }

    void cosInnego(int a, String b, boolean c, double d) {
        System.out.println("pierwsza metoda cosInnego !!");
    }
}
