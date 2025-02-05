package com.company;

public class Student {
    private String nume;
    private Float nota;
    static int nrStudenti = 0;

    Student(String nume, Float nota){
        this.nume = nume;
        this.nota = nota;
        nrStudenti++;
        System.out.println("s-a creat un student");
    }

    static int scadeNrstudenti(){
        return nrStudenti--;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }
}
