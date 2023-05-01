package com.ua.robot.homeWork32;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " now " + i);
        }
    }

}
