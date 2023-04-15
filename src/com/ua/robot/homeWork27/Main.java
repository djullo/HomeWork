package com.ua.robot.homeWork27;


/*
Створити класс з 2 функціями.
Перша зберігає отриману строку у файл.
Друга - зчитує дані з файлу та повертає його користувачу.
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "src/com/ua/robot/homeWork27/test.txt";
        String content = "Hello, world!";
        ReadAndWrite.writeToFile(fileName, content);
        String loadedContent = ReadAndWrite.readFromFile(fileName);
        System.out.println(loadedContent);
    }
}