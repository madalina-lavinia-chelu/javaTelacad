package com.company.ex1;

public class Main {
    public static void main(String[] args) {
        Masina m1 = new Masina(250, "rosu", 4);
        m1.descriere();
        m1.accelereaza(60);
        m1.accelereaza(30);
        m1.accelereaza(1000);

        Motocicleta motocicleta = new Motocicleta(120, "negru", true);
        motocicleta.descriere();
        motocicleta.accelereaza(70);
    }
}
