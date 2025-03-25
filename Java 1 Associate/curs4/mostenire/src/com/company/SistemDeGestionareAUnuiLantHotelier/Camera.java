package com.company.SistemDeGestionareAUnuiLantHotelier;

public abstract class Camera {
    protected int numeCamera;
    protected String tipCamera;
    protected double pretPerNoapte;
    protected boolean statusCamera;

    public Camera(int numeCamera, String tipCamera, double pretPerNoapte, boolean statusCamera) {
        this.numeCamera = numeCamera;
        this.tipCamera = tipCamera;
        this.pretPerNoapte = pretPerNoapte;
        this.statusCamera = statusCamera;
    }

    public abstract void rezerva();
    public abstract void anumare();

    public void afiseazaDetalii(){
        System.out.println("Camera{" +
                "numeCamera=" + numeCamera +
                ", tipCamera='" + tipCamera + '\'' +
                ", pretPerNoapte=" + pretPerNoapte +
                ", statusCamera=" + statusCamera +
                '}');
    }
    public void calculeazaPret(int numarNopti){
        System.out.println("Pret final: ");
        if(numarNopti <= 0)
            System.out.println("Valoare invalida");
        else
            System.out.println(numarNopti * this.pretPerNoapte);
    }


}
