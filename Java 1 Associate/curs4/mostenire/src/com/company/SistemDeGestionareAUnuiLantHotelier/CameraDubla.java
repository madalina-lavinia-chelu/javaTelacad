package com.company.SistemDeGestionareAUnuiLantHotelier;

public class CameraDubla extends Camera implements Rezervabil, Plata{
    public CameraDubla(int numeCamera, String tipCamera, double pretPerNoapte, boolean statusCamera) {
        super(numeCamera, tipCamera, pretPerNoapte, statusCamera);
    }

    @Override
    public void rezerva() {
        System.out.println("Camera Dubla a fost rezervată.");
    }

    @Override
    public void anumare() {
        System.out.println("Camera Dubla a fost anulata.");
    }
}
