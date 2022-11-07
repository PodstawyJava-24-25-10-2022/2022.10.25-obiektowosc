package com.comarch.obiektowosc;

import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        Client c1 = new Client();
        c1.name = "Zbyszek";
        c1.surname = "Kowalski";
        c1.age = 30;
        c1.pesel = 12341234123L;

        Address address = new Address();
        address.city = "Krakow";
        address.street = "Ogrodowa";

        c1.address = address;

        Client c2 = new Client();
        c2.name = "Janusz";
        c2.surname = "Malinowski";
        c2.age = 50;
        c2.pesel = 34534534534L;

        System.out.println(c1);
        System.out.println(c1.name);
        System.out.println(c1.surname);

        System.out.println(c1.address.street);
        System.out.println(c1.address.city);

        //String s = new String("Karol");

        Random generator = new Random();
        generator.nextInt(101);
        generator.nextInt();
        generator.nextInt(3,5);

        double d = 5.6;
        int wynikDodawania = c2.add(5, 4);
        double wynikDodawaniaDouble = c2.add(3.3, 6.6);
        System.out.println(wynikDodawania);
        System.out.println(wynikDodawaniaDouble);

        int a = 5;
        int b = 10;
        System.out.println(c1.add(a, b));

        c1.powiedzSwojeImie();
        c2.powiedzSwojeImie();

        c1.cosInnego(5, "ABC", true, 5.6);

        System.out.println("ABC");
        Random random = new Random();
        random.nextInt();
        random.nextInt(101);
        random.nextInt(5, 40);
    }
}
