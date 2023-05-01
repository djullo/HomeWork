package com.ua.robot.homeWork32;

//Створити 2 потоки, які паралельно виводять на консоль числа від 1 до 10 та пишуть назву потоку.
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "Thread 1");
        Thread thread2 = new Thread(myThread, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
