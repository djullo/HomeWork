package com.ua.robot.homeWork8;

import java.util.Random;

/*
1) Створити програму в якій потрібно створити масив з 10 елементів та заповнити його випадковими числами
2) Вивести його на консоль
3) Знайти мінімальне значення
4) Знайти максимальне значення
5) Знайти середнє значення
6) Знайти суму всіх елементів
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        randomArr(arr);
        minValue(arr);
        maxValue(arr);
        averageValue(arr);
        sumArr(arr);
    }

    static void randomArr(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 50);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Random Arr");

    }

    static void minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " Min Value");
    }

    static void maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max + " Max Value");
    }

    static void averageValue(int[] arr) {
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average /= arr.length;

        System.out.println(average + " Average");
    }

    static void sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum + " Sum Arr");
    }


}
