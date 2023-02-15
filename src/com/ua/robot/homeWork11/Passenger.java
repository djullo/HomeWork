package com.ua.robot.homeWork11;

public class Passenger extends Car {
    private int numberOfSeats;
    private int numberOfWindows;

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public void toneCar() {
        System.out.print("Passenger ");
    }

    public String toString() {
        return "Passenger{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberOfWindows=" + numberOfWindows +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
