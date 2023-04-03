package com.ua.robot.homeWork23;

import java.util.*;

import static java.util.stream.Collectors.*;

/*
1) Створити лист з 20 прізвищами. Вони повинні повторюватися.
За допомогою стрім апі перетворити цей лист на мапу.
У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.
2) Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API.
 */
public class Main {
    public static void main(String[] args) {
        List<Surname> surname = List.of(
                new Surname("Нечуй"),
                new Surname("Доценко"),
                new Surname("Доценко"),
                new Surname("Доценко"),
                new Surname("Нечуй"),
                new Surname("Нечуй"),
                new Surname("Нечуй"),
                new Surname("Нечуй"),
                new Surname("Нечуй"),
                new Surname("Нечуй"),
                new Surname("Ґудзик"),
                new Surname("Ґудзик"),
                new Surname("Ґудзик"),
                new Surname("Антонюк"),
                new Surname("Антонюк"),
                new Surname("Петров"),
                new Surname("Петров"),
                new Surname("Петров"),
                new Surname("Петров"),
                new Surname("Петров")
        );

/*
        Stream<String> mapSurname = Stream.of(surname.toString());
        mapSurname.map(w -> w.split(" ")).flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + " " + count));
        List<String> surnames = Arrays.asList("Нечуй", "Петренко", "Петренко", "Петренко", "Нечуй");
        Map<String, Long> surnameMap = surnames.stream().collect(groupingBy(Function.identity(), counting()));
        System.out.println(surnameMap);
*/

        Map<String, Long> map = surname.stream()
                .collect(groupingBy(Surname::getSurname, counting()));
        System.out.println("Мапа " + map);

        List<Integer> listRandomNumber = new ArrayList<>(10); // 2 Завдання
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listRandomNumber.add(random.nextInt(0, 101));
        }
        int sumRandomNumber = listRandomNumber.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма рандомних чисел = " + sumRandomNumber);
    }
}