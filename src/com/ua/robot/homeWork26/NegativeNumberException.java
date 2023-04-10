package com.ua.robot.homeWork26;

public class NegativeNumberException extends Exception{
    public NegativeNumberException() {
        super("Число не може бути менше 0.");
    }
}
