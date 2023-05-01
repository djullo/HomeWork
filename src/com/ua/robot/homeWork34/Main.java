package com.ua.robot.homeWork34;

//Створити callable поток, який повертає випадково згенероване число від 1 до 50.
// Зробити пул с 10 потоків для виклику цього методу

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer>[] futures = new Future[10];
        for (int i = 0; i < 10; i++) {
            Callable<Integer> task = new MyCallable();
            futures[i] = executorService.submit(task);
        }
        executorService.shutdown();
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Result from thread " + (i + 1) + ": " + futures[i].get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
