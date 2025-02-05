package com.ex.geom;

public class Punct {
    int x;
    int y;

    Punct(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getDistance(Punct newPoint){
        return (int) Math.sqrt(Math.pow(newPoint.x + this.x,2) + Math.pow(newPoint.y + this.y, 2));
    }
}
