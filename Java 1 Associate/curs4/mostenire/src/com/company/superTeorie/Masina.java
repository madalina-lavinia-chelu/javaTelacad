package com.company.superTeorie;

public class Masina extends Autovehicul{
    String marca;

    public Masina(int viteza, String marca){
        super(viteza);
        this.marca = marca;
    }
    @Override
    public void afiseazaDetalii(){
        super.afiseazaDetalii();
        System.out.println("Marca: " + this.marca);

    }

    @Override
    public String toString() {
        return "Masina{" +
                "viteza=" + viteza +
                ", marca='" + marca + '\'' +
                '}';
    }
}
