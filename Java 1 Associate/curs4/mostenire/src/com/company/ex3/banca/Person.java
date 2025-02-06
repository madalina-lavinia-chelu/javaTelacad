package com.company.ex3.banca;

public class Person {
    private final String name;
    private final String CNP;
    private final String adresa;

    public Person(String name, String CNP, String adresa) {
        this.name = name;
        this.CNP = CNP;
        this.adresa = adresa;
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public String getAdresa() {
        return adresa;
    }


}
