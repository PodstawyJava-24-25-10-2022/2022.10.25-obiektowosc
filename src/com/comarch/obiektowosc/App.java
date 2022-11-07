package com.comarch.obiektowosc;

public class App {
    public static void main(String[] args) {
        long pesel = 12312312312L;
        String peselWStringu = pesel + "";
        System.out.println(peselWStringu.substring(7));

        String pesel2 = "00221231232";
        System.out.println(pesel2);

        Client[] clients = new Client[100];

        Client c = new Client();
        Client c2 = new Client();

        int[] tab = new int[10];
        System.out.println(tab);

        int i = 5;
        System.out.println(i);
    }
}
