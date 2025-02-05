package com.company;

public class Main {

    public static void main(String[] args) {

        //clasa student
        Student s1 = new Student("Maria",23f);
        Student s2 = new Student("Ioana",25f);
        Student s3 = new Student("Cariana",29f);
        Student s4 = new Student("Stelina",19f);
        System.out.println("nr studenti " + Student.nrStudenti);

        System.out.println(Student.scadeNrstudenti());
        System.out.println("nr studenti " + Student.nrStudenti);

        System.out.println();


        //clasa masina
        Car c1 = new Car();
        c1.setKm(12);
        c1.setNumar("B10ABC");

        System.out.println(c1);
        System.out.println("Km în mile: " + Car.transformaKmInMile(c1.getKm()));

        Car c2 = new Car();
        c2.setKm(25);
        c2.setNumar("B20DCF");

        System.out.println(c2);
        System.out.println("Km în mile: " + Car.transformaKmInMile(c2.getKm()));


    }
}
