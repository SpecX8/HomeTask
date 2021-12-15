package com.company.Lesson5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {

        /**
         * Задание 2
         *
         * Известно, что у четных чисел младший бит имеет значение 0 Используя IntelliJ IDEA, создайте класс Parity.
         * Напишите программу, которая будет выполнять проверку чисел на четность. Предложите два варианта решения
         * поставленной задачи.
         */

        // Первое решение
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки на четность: ");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("число number четное и равно " + number);
        } else {
            System.out.println("число number не четное и равно " + number);
        }
        System.out.println();

        // Второе решение
        String message = ((number & 1) == 0 ? ("число number четное и равно " + number)
                : ("число number не четное и равно " + number));
        System.out.println(message);
    }
}
