package com.ua.robot.homeWork33;

import java.util.Random;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(1, 10);
            System.out.println("Generated number: " + number);
            if (number == 5) {
                System.out.println("Number 5 generated, stopping thread...");
                break;
            }
        }
    }
}
