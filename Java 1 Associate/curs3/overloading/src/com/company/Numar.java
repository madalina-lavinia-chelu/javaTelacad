package com.company;

public class Numar {
    public double calculeazaSuma(int a, int b){
        return a + b;
    }

    public double calculeazaSuma(int a, double b){
        return a + b;
    }
    public double calculeazaSuma(double a, int b){
        return a + b;
    }
    public void calculeazaSuma(){
        System.out.println("nu se poate calcula fara valori de intrare");
    }
    public double calculeazaSuma(int a) {
        return 0;
    }
    static public int calcul(int a, int b){
        return a + b;
    }
    static public int calcul(char a, int b){
        return a + b;
    }



}
