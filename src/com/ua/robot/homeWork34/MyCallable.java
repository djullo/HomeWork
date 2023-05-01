package com.ua.robot.homeWork34;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;


public class MyCallable implements Callable<Integer> {
    private final ThreadLocalRandom random = ThreadLocalRandom.current();

    public Integer call() throws Exception {
        int randomNumber = random.nextInt(1, 51);
        Thread.sleep(1000);
        return randomNumber;
    }
}
