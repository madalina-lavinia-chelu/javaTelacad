package com.company.ex2;

public class Publicatie {
     private String titlu;
     private String autor;
     private int anPublicatie;

    public Publicatie(String titlu, String autor, int anPublicatie) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
    }

    protected void afisareInformatii(){
        System.out.print("Publicatie{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", anPublicatie=" + anPublicatie) ;
    }


    public String getAutor() {
        return autor;
    }

    public int getAnPublicatie() {
        return anPublicatie;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnPublicatie(int anPublicatie) {
        this.anPublicatie = anPublicatie;
    }
}
