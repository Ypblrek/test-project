package com.tms.paterny.builder;

public class House {
    private int wallCount;
    private double square;
    private int countOfWindows;
    private String floorMaterial;
    private int countOfDoors;

    public static class Builder {
        private final House house;

        public Builder() {
            this.house = new House();
        }

        public Builder setWallCount(int count) {
            house.setWallCount(count);
            return this;
        }

        public Builder setSquare(double square) {
            house.setSquare(square);
            return this;
        }

        public Builder setCountOfWindows(int count) {
            house.setCountOfWindows(count);
            return this;
        }

        public Builder setFloorMaterial(String material) {
            house.setFloorMaterial(material);
            return this;
        }

        public Builder setCountOfDoors(int countOfDoors) {
            house.setCountOfDoors(countOfDoors);
            return this;
        }

        public House build() {
            return house;
        }
    }

    public int getWallCount() {
        return wallCount;
    }

    public void setWallCount(int wallCount) {
        this.wallCount = wallCount;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getCountOfWindows() {
        return countOfWindows;
    }

    public void setCountOfWindows(int countOfWindows) {
        this.countOfWindows = countOfWindows;
    }

    public String getFloorMaterial() {
        return floorMaterial;
    }

    public void setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    @Override
    public String toString() {
        return "House{" +
                "wallCount=" + wallCount +
                ", square=" + square +
                ", countOfWindows=" + countOfWindows +
                ", floorMaterial='" + floorMaterial + '\'' +
                ", countOfDoors=" + countOfDoors +
                '}';
    }
}