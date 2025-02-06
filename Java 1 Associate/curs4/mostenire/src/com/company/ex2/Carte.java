package com.company.ex2;

public class Carte extends Publicatie{
    private int nrPagini;

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        super(titlu, autor, anPublicatie);
        this.nrPagini = nrPagini;
    }
    protected void afisareInformatii(){
        super.afisareInformatii();
        System.out.println(", nrPagini="+ this.nrPagini +
                '}');
    }

}
