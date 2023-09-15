package com.tms.solidS.DDDD;

public class main {
    public static void main(String[] args){
        Car car = new Audi();
        System.out.println(car.model);
        System.out.println(car.fuel);
        car.start();
        car.stop();
    }
}
