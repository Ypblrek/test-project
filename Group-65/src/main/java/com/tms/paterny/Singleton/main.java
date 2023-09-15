package com.tms.paterny.Singleton;

public class main {
    public static void main(String[] args){
        Belaz belaz =  Belaz.createBelaz( 100, 5);
        System.out.println(belaz.cost);

        Belaz belaz2 =  Belaz.createBelaz( 200, 10);
        System.out.println(belaz2.cost);
    }
}
