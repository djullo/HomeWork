package com.ua.robot.homeWork11;

public class Truck extends Car {
    private int loadCapacity;
    private int numberOfWheels;

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void toneCar() {
        System.out.print("Truck ");
    }

    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", numberOfWheels=" + numberOfWheels +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}