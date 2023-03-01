package com.ua.robot.homeWork15;

/*
1) Створити клас людина і двох потомків. Водій та пілот. Створити інтерфейс для описання процесу водіння.
Зробити так, щоб цей клас імплементував цей інтерфейс.
2)Створити інтерфейс який описує вміння літати і імплементувати його.
3)У головному класі викликати методи летати та водити авто за допомогою інтерфейсів і поліморфізму.
 */
public class Main {
    public static void main(String[] args) {
        Human aviator = new Aviator();
        Human driver = new Driver();
        aviator.flying();
        driver.drive();

        Aviator aviator2 = new Aviator();
        Driver driver2 = new Driver();
        aviator2.flying();
        driver2.drive();

        Flying.hello();
        Driving.hello();
    }
}
