package com.ua.robot.homeWork4;

public class Main {
    public static void main(String[] args) {
        String str = "hello DREAM";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(10));

        // "Test" Перше слово стане велике друге маленьке
        String str2 = str.substring(0, 6);
        String str3 = str2.toUpperCase();
        String str4 = str.substring(6, 11);
        String str5 = str4.toLowerCase();
        String str6 = str3 + str5;
        System.out.println(str6);

    }
}
