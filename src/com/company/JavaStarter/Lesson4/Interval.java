package com.company.JavaStarter.Lesson4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        /**
         * Задание 3
         *
         * Используя IntelliJ IDEA, создайте класс Interval. Напишите программу определения, попадает ли
         * указанное пользователем число от 0 до 100 в числовой промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100].
         * Если да, то укажите, в какой именно промежуток. Если пользователь указывает число, не входящее ни в
         * один из имеющихся числовых промежутков, то выводится соответствующее сообщение.
         */
        int a;
        String message = "You entered a number in an invalid range";
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if (a < 0) {
            System.out.println(message);
        } else if (a >= 0) {
            if (a <= 14) {
                System.out.println("a is in the interval [0 - 14]");
            } else if (a >= 15) {
                if (a <= 35) {
                    System.out.println("a is in the interval [15 - 35]");
                } else if (36 <= a) {
                    if (a <= 50) {
                        System.out.println("a is in the interval [36 - 50]");
                    } else if (a >= 50) {
                        if (a <= 100) {
                            System.out.println("a is in the interval [50 - 100]");
                        } else if (a > 100) {
                            System.out.println(message);
                        }
                    }
                }
            }
        }
    }
}