package com.ua.robot.homeWork22;

import java.util.*;

/*
Створити клас студент з полями Прізвище та Середній бал. Написати два компаратори для сортування по цим полям.
У головному класі наповнити лист даними про студентів та відсортувати за допомогою цих компараторів.
Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих
*/
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Burlaka", 20));
        students.add(new Student("Nesterenko", 10));
        students.add(new Student("Smirnova", 40));
        students.add(new Student("Tabakharnuk", 80));
        students.add(new Student("Verpahovkiy", 30));
        students.add(new Student("Plitina", 60));
        students.add(new Student("Antonuk", 100));

        System.out.println(students);

        Collections.sort(students, Comparator.comparing(Student::getSurname));
        System.out.println(students);

        Collections.sort(students, Comparator.comparing(Student::getAverageScore));
        System.out.println(students);

    }

}
