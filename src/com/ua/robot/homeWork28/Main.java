package com.ua.robot.homeWork28;

import java.nio.file.*;

//Переробити програму з минулого завдання - але використовувати методи с пакету NIO
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/com/ua/robot/homeWork28/test.txt");
        String content = "Hello, world!";
        ReadAndWrite.writeToFile(path.toString(), content);
        String loadedContent = ReadAndWrite.readFromFile(path.toString());
        System.out.println(loadedContent);
    }

}
