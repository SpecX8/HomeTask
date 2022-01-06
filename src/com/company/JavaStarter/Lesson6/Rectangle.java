package com.company.JavaStarter.Lesson6;

public class Rectangle {
    public static void main(String[] args) {

        /**
         * Задание 5
         *
         * Используя IntelliJ IDEA, создайте класс Rectangle. Создайте две целочисленные переменные и задайте им
         * некоторые значения. Применяя технику вложенных циклов, нарисуйте прямоугольник из звездочек.
         * Используйте значения ранее созданных переменных для указания высоты и ширины прямоугольника.
         */

        int m = 15;
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print('*');
                } else {
                    if (j == 0 || j == m - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");
        }
    }
}
