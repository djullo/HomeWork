package com.ua.robot.homeWork23;

public class Surname {
    private final String surname;

    public String getSurname() {
        return surname;
    }

    public Surname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Surname{" +
                "surname='" + surname + '\'' +
                '}';
    }
}
