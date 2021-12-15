package com.company.Lesson6;

import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
        /**
         * Задание 3
         *
         * Используя IntelliJ IDEA, создайте класс. Используя циклы и метод: System.out.print("*"),
         * System.out.print(" "), System.out.print("\n") (для перехода на новую строку).
         * Выведите на экран:
         *  прямоугольник
         *  прямоугольный треугольник
         *  равносторонний треугольник
         *  ромб.
         */

        // прямоугольник
        for (int i = 0; i < 4; i++) {
            // Выводим одну строку из 4 звездочки.
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            // Переход на новую строку.
            System.out.println();
        }
        // треугольник

        int rect = 7;

        for (int i = 0; i < rect; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // ромб

        int rhombus = 7;
        int center = rhombus / 2;
        for (int i = 0; i < rhombus; i++) {
            for (int j = 0; j < rhombus; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= center + i - rhombus + 1 && j <= center - i + rhombus - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }

    }
}


