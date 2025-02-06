package com.company.ex1;

public abstract class Vehicul {

    protected int vitezaMaxima;
    protected String culoare;
    protected int numarRoti;
    protected int vitezaCurenta = 0;

    public Vehicul(int vitezaMaxima, String culoare, int numarRoti) {
        this.vitezaMaxima = vitezaMaxima;
        this.culoare = culoare;
        this.numarRoti = numarRoti;
    }
    public void descriere() {
        System.out.println("Culoare: " + culoare + ", Viteza maxima: " + vitezaMaxima +
                " km/h, Numar roti: " + numarRoti);
    }

    protected abstract void accelereaza(int viteza);

}
