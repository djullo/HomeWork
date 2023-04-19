package com.ua.robot.homeWork28;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class ReadAndWrite {

    public static void writeToFile(String fileName, String content) {
        try {
            Path path = Paths.get(fileName);
            byte[] strToBytes = content.getBytes();
            Files.write(path, strToBytes);
        } catch (IOException e) {
            System.out.println("Error writing " + fileName + ": " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        String content = "";
        try {
            Path path = Paths.get(fileName);
            byte[] bytes = Files.readAllBytes(path);
            content = new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error reading " + fileName + ": " + e.getMessage());
        }
        return content;
    }
}
