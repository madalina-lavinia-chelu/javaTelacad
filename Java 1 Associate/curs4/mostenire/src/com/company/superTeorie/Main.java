package com.company.superTeorie;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina(120, "BMW"); // viteza = 120
        Motocicleta motocicleta = new Motocicleta(180, "Sport"); // viteza = 180
        Autovehicul a = new Autovehicul(10);

        System.out.println(masina);
        masina.afiseazaDetalii();
        System.out.println();

        System.out.println(motocicleta);
        motocicleta.afiseazaDetalii();
        System.out.println();

        System.out.println(a);

    }
}
