package com.ua.robot.homeWork26;

public class MathUtils {
    public static int square(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }
        return number * number;
    }
}
