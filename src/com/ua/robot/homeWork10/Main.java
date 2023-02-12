package com.ua.robot.homeWork10;

public class Main {
    public static void main(String[] args) {
        Student oleg = new Student();
        oleg.setName("Oleg");
        oleg.setCourse(1);
        oleg.setGender("Male");
        oleg.setAge(22);
        System.out.println(oleg);

        Teacher physics = new Teacher();
        physics.setAge(30);
        physics.setName("Dmytro");
        physics.setGender("Male");
        physics.setScientificDegree("PhD");
        System.out.println(physics);

        Array arr = new Array();
        arr.randomArr(new int[5]);

    }

}
