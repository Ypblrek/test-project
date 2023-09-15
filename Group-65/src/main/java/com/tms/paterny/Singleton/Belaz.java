package com.tms.paterny.Singleton;

public class Belaz {
    public int cost;
    public double weight;
    private static Belaz belaz;

    private Belaz(int cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }
    public static Belaz createBelaz(int cost,double weight){
        if (belaz==null){
            belaz= new Belaz(cost, weight);
        }
        return belaz;

    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
