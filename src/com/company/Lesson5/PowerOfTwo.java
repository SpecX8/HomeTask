package com.company.Lesson5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        /**
         * Задание 5
         *
         * Известно, что у чисел, которые являются степенью двойки, только один бит имеет значение 1.
         * Используя IntelliJ IDEA, создайте класс PowerOfTwo. Напишите программу, которая будет
         * выполнять проверку – является ли указанное число степенью двойки или нет.
         */

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        number = scanner.nextInt();
        if ((number & (number - 1)) == 0) {
            System.out.println(number + " является степенью двойки");
        } else {
            System.out.println(number + " не является степенью двойки");
        }
    }
}
