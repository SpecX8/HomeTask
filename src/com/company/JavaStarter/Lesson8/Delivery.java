package com.company.JavaStarter.Lesson8;

import java.util.Scanner;

public class Delivery {
    /**
     * Задание 3
     *
     * Имеется N клиентов, которым компания производитель должна доставить товар. Сколько существует возможных
     * маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина? Используя IntelliJ IDEA,
     * создайте класс Delivery. Напишите программу, которая будет рассчитывать и выводить на экран количество
     * возможных вариантов доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с
     * помощью рекурсии. Объясните, почему не рекомендуется использовать рекурсию для расчета факториала.
     * Укажите слабые места данного подхода.
     */
    private static void fact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество клиентов: ");
        int factorial = scanner.nextInt(); // Вводим число клиентов
        int i = factorial;
        if (i > 1) {
            do {
                i--;
                factorial = factorial * i;
            } while (i > 1);
        }
        System.out.print("Колличество вариантов доставки = " + factorial);
    }

    public static void main(String[] args) {
        fact();
    }
}

