package com.ua.robot.homeWork25;

import java.util.Scanner;

/*
1) Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.
2) При вводі замість числа  буков - показувати повідомлення про помилку на консоль.
3) За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean success = false;
        while (!success) {
            try {
                System.out.print("Введіть число: ");
                String input = scanner.nextLine();
                number = Integer.parseInt(input);
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введене значення не є числом.");
            }
        }
        System.out.println("Введене число: " + number);
    }
}
