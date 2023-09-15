package com.tms.paterny.builder;

public class main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .setWallCount(4)
                .setFloorMaterial("Wood")
                .build();

        System.out.println(house);
    }
}
