package com.ua.robot.homeWork27;

import java.io.*;

public class ReadAndWrite {
    public static void writeToFile(String fileName, String content) {
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            byte[] strToBytes = content.getBytes();
            outputStream.write(strToBytes);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error writing " + fileName + ": " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        String content = "";
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            int data = inputStream.read();
            while (data != -1) {
                content += (char) data;
                data = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Error reading " + fileName + ": " + e.getMessage());
        }
        return content;
    }
}
