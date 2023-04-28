package com.ua.robot.homeWork33;

// Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль.
// Якщо згенероване число == 5 - то перервати роботу потоку
public class Main   {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        thread.start();
    }
}
