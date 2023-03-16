package com.ua.robot.homeWork18;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів.
Для кожного підібрати свій тип
Зберегти у колекції список студентів (класс Студент теж створити)
Вивести цей список
Опціонально: написати реалізацію класу ArrayList або LinkedList
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> listNumbersTen = new ArrayList<>(10);

        List<Integer> listNumbersTwoThousand = new ArrayList<>(2000000);

        List<Student> student = new LinkedList<>();
        Student jane = new Student("Jane");
        Student john = new Student("John");
        Student mary = new Student("Mary");
        Student peter = new Student("Peter");

        student.add(jane);
        student.add(john);
        student.add(mary);
        student.add(peter);

        System.out.println(student);

    }

}
