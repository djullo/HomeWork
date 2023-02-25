package com.ua.robot.homeWork12;

public class Human {

    static {
        System.out.println("1) Mammals block static");
    }

    {
        System.out.println("3) Mammals block first");
    }

    {
        System.out.println("4) Mammals block second");
    }

    public Human() {
        System.out.println("5) Mammals constructor");
    }
}
