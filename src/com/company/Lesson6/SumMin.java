package com.company.Lesson6;

public class SumMin {
    public static void main(String[] args) {
        /**
         * Задание 2
         *
         * Используя IntelliJ IDEA, создайте класс SumMin. Дано два числа A и B (A<B) выведите суму всех чисел,
         * расположенных между данными числами на экран. Дано два числа A и B (A<B) выведите все нечетные значения,
         * расположенные между данными числами.
         */

        // 1
        int A = 2;
        int B = 15;
        // обьявляем переменную в которую будем перемещать вычисления
        int sumOfNumber = 0;
        for (int i = A; i <= B; i++) {
            sumOfNumber = sumOfNumber + i;
        }
        System.out.println("sumOfNumber = " + sumOfNumber); // выводим результат в консоль
        // 2
        System.out.print("нечётные числа из диапазона от " + A + " до " + B + " равны:");
        for (int i = A; i <= B; i++) {
            if(i%2==0)continue; // исключаем из цикла чётные числа
            System.out.print(" " + i); // выводим их в консоль
        }
    }
}
