package com.ua.robot.homeWork12;

public class Human {

    static {
        System.out.println("1) Human block static");
    }

    {
        System.out.println("3) Human block first");
    }

    {
        System.out.println("4) Human block second");
    }

    public Human() {
        System.out.println("5) Human constructor");
    }
}
