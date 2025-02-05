package com.company;


public class Punct {
    int x;
    int y;
    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    Punct(){
        this(10,10);
        System.out.println("s-a apelat constructorul supraincarcat");
        System.out.println(this.x);

    }
    int adunare1(int x, int y){
        System.out.println(adunare2(x, y));
        return this.x + this.y;
    }
    int adunare2(int x, int y){
        return x + y;
    }

    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
