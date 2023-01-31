package com.ua.robot.homeWork7;

/**
 * 1. Створити метод який повертає куб заданого числа
 * 2. Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
 * 3. Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод
 */
public class Main {
    public static void main(String[] args) {
        int firstNumber = 2;
        int cube = cube(firstNumber);
        String symbol = " %";
        System.out.println(cube);
        printSymbolCube(cube);
        printSymbolPus(cube, symbol);
    }

    static int cube(int a) {
        return a * a * a;
    }

    static void printSymbolCube(int cube) {
        for (int i = 0; i < cube; i++) {
            System.out.print(" *");
        }
    }

    static void printSymbolPus(int cube, String symbol) {
        for (int i = 0; i < cube; i++) {
            System.out.print(symbol);
        }
    }

}
