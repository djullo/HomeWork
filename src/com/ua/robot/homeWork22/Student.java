package com.ua.robot.homeWork22;

public class Student {
    private final String surname;
    private final int averageScore;

    public String getSurname() {
        return surname;
    }

    public int getAverageScore() {
        return averageScore;
    }


    public Student(String surname, int averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student |" +
                 " " + surname + ',' +
                " " + averageScore +
                " |";
    }
}
