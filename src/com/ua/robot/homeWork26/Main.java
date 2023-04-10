package com.ua.robot.homeWork26;

import java.util.Scanner;

/*
Створити виняток який викидається коли число менше нуля.
Створити функцію, яка приймає число і повертає його квадрат.
Якщо число буде менше нуля - то викинути створений вийняток.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведіть число: ");
        int num = scanner.nextInt();
        //int num = 23;
        try {
            int result = MathUtils.square(num);
            System.out.println("Квадрат числа " + num + " є " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
