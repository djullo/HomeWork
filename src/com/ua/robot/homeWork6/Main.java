package com.ua.robot.homeWork6;

public class Main {
    public static void main(String[] args) {
        //Створити програму для виведення чисел від 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        /*Показати всі парні числа в діапазоні від 1 до 100
        1 варіант
        */
        System.out.println();
        int step = 2;
        for (int i = 2; i <= 100; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
        /*Показати всі парні числа в діапазоні від 1 до 100
        2 варіант (думаю більш правильно)
        */
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println(" ");
        //Знайти факторіал числа 7
        int number = 1;
        for (int i = 1; i <= 7; i++) {
            number = number * i;
        }
        System.out.println(number);
        //Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 3; i <= 11; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
