package com.company.ex1;

public class Masina extends Vehicul {
    private int nrUsi;

    public Masina(int vitezaMaxima, String culoare, int nrUsi) {
        super(vitezaMaxima, culoare, 4);
        this.nrUsi = nrUsi;
    }

    @Override
    public void descriere(){
        super.descriere();
        System.out.println("numar usi " + nrUsi);
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



}
