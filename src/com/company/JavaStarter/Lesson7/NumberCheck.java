package com.company.JavaStarter.Lesson7;

import java.util.Scanner;

public class NumberCheck {
    /**
     * Задание 4
     *
     * Используя IntelliJ IDEA, создайте класс NumbersCheck. Напишите метод, который будет определять:
     * 1) является ли введенное число положительным или отрицательным.
     * 2) Является ли оно простым (используйте технику перебора значений). Простое число – это натуральное
     * число, которое делится на 1 и само на себя. Чтобы определить простое число или нет, следует найти
     * все его целые делители. Если делителей больше 2-х, значит оно не простое.
     * 3) Делится ли на 2, 5, 3, 6, 9 без остатка.
     */

    static void number() {
        int temp;
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");

        // считывает число
        int num = scan.nextInt();
        // проверяем на четное или не четное
        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
        // проверяем число на простоту
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if (isPrime) {
            System.out.println(num + " - простое число");
        } else {
            System.out.println(num + " - составное число");
        }
    }

    public static void main(String[] args) {
        number();
    }
}
