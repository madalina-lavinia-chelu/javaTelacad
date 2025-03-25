package com.company;

public class Main {

    public static void main(String[] args) {
        Punct p1 = new Punct(7,8);
        Punct p2 = new Punct();
        System.out.println(p1.adunare1(p1.x, p1.y));

        System.out.println(p2);

        System.out.println(p1.getPunct());
    }
}
