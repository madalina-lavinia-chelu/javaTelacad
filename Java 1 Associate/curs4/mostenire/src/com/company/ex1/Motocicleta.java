package com.company.ex1;

public class Motocicleta extends Vehicul{
    private boolean inUz;

    Motocicleta(int vitezaMaxima, String culoare, boolean inUz){
        super(vitezaMaxima, culoare,2);
        this.inUz = inUz;

    }

    @Override
    protected void accelereaza(int viteza){
        if(vitezaCurenta + viteza <= vitezaMaxima) {
            vitezaCurenta += viteza;
            System.out.println("Masina accelereaza la " + vitezaCurenta + "km/h");
        }
        else
        {
            System.out.println("Masina nu poate depasi viteza maxima de " + vitezaMaxima + "km/h");
        }
    }

    public void descriere() {
        super.descriere();
        System.out.println("este in uz? " + (inUz ? "da" : "nu"));
    }





}
