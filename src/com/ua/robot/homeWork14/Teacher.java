package com.ua.robot.homeWork14;

public class Teacher extends Mammals {
    private double time;
    private double distanceTraveled;

    public Teacher() {

    }

    public Teacher(double time, double distanceTraveled) {
        this.time = time;
        this.distanceTraveled = distanceTraveled;
    }

    public double averageWalkingSpeed() {
        return distanceTraveled / time;
    }

    @Override
    public void print() {
        System.out.println(averageWalkingSpeed());
    }

}
