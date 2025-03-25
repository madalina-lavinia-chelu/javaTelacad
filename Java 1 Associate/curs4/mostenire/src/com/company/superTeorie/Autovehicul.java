package com.company.superTeorie;

public class Autovehicul {
    protected int viteza;
    int variabila;

     public Autovehicul(int viteza){
        this.viteza = viteza;
    }

    public void afiseazaDetalii(){
        System.out.println("Viteza: " + this.viteza);
    }

    @Override
    public String toString() {
        return "Autovehicul{" +
                "viteza=" + viteza +
                '}';
    }
}
