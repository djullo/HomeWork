package com.ua.robot.homeWork20;

import java.util.HashMap;
import java.util.Map;

//Мапа потрібна містити інформацію про 10 будь яких слів українською мовою і ії переклад на: англійску, японську, німецьку.
// Коли користувач дає мапі слово украінською - то потрібен отримати у результаті переклад на ці 3 мови
public class Main {
    public static void main(String[] args) {
        Map<String, String> ukrToEngJapGer = new HashMap<>();
        ukrToEngJapGer.put("Привіт", "Hello, Hallo, こんにちは");
        ukrToEngJapGer.put("Час", "Time, Zeit,時間");
        ukrToEngJapGer.put("Година", "Hour, Stunde, 雪");
        ukrToEngJapGer.put("Ручка", "Pen, Stift, ペン");
        ukrToEngJapGer.put("Годинник", "Clock, Uhr, 時計");
        ukrToEngJapGer.put("Вода", "Water, Wasser, 水");
        ukrToEngJapGer.put("Сніг", "Snow, Schnee, 雪");
        ukrToEngJapGer.put("Кухня", "Kitchen, Küche, 台所");
        ukrToEngJapGer.put("Голова", "Head, Kopf, 頭");
        ukrToEngJapGer.put("Диван", "Sofa, Tisch, ソファー");
        
        System.out.println(ukrToEngJapGer.get("Привіт"));
    }
}
