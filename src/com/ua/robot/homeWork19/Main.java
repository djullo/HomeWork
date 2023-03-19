package com.ua.robot.homeWork19;

import java.util.*;

/*
1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном від 1 до 50 за зберегти їх у різні типи колекцій сет
2. Вивести всі 3 варіанти на консоль
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 1000; i++) {
            hashSet.add(random.nextInt(1,51));
            linkedHashSet.add(random.nextInt(1,51));
            treeSet.add(random.nextInt(1,51));
        }

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

    }


}