package com.tms.solidS.L;

public class Rectangle {
    private int x;
    private int y;

    void perimeter(){
        System.out.println((2 * x) + (2 * y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
