package com.ua.robot.homeWork12;

public class Woman extends Human {

    static {
        System.out.println("2) Woman block static");
    }

    {
        System.out.println("6) Woman block first");
    }

    {
        System.out.println("7) Woman block second");
    }

    public Woman() {
        System.out.println("8) Woman constructor");
    }

}
