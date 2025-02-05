package com.company;

public class Car {
    private String numar;
    private int km;
    void seDeplaseaza(){
        //
    }

    void staLaSemafor(){
        //
    }
    static double transformaKmInMile(int nrKm){
        return 0.6 * nrKm;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numar='" + numar + '\'' +
                ", km=" + km +
                '}';
    }
}
