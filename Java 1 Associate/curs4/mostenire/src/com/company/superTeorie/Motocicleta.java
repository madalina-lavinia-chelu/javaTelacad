package com.company.superTeorie;

public class Motocicleta extends Autovehicul{
    String tip;
    public Motocicleta(int viteza, String tip){
        super(viteza);
        this.tip = tip;
    }

    @Override
    public void afiseazaDetalii(){
        super.afiseazaDetalii();
        System.out.println("Tip: " + this.tip);
        super.variabila = 10;
        System.out.println("Variabila mostenita: " + super.variabila);

    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "viteza=" + viteza +
                ", tip='" + tip + '\'' +
                '}';
    }
}
