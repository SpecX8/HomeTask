package com.company.Lesson7;

import java.util.Scanner;

public class Conversion {
    /**
     * Задание 3
     *
     * Используя IntelliJ IDEA, создайте класс Conversion. Напишите программу, которая будет выполнять
     * конвертирование валют. Пользователь вводит: сумму денег в определенной валюте, курс для конвертации
     * в другую валюту. Организуйте вывод результата операции конвертирования валюты на экран.
     */

    static void conv (){
        int money;
        double curse, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму денег для конвертации: ");
        money = scanner.nextInt();
        System.out.print("Введите курс конвертации: ");
        curse  = scanner.nextDouble();
        sum = (double)money*curse;
        System.out.println("Сумма денег после конвертации: " + sum);
    }

    public static void main(String[] args) {
        conv();
    }
}
