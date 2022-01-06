package com.company.JavaStarter.Lesson3;

public class ArithmeticAverage {
    public static void main(String[] args) {
        /**
         * Задание 2
         *
         * Используя IntelliJ IDEA, создайте класс ArithmeticAverage . Вычислите среднее
         * арифметическое трех целочисленных значений и выведите его на экран.
         * С какой проблемой вы столкнулись? Какой тип переменных лучше использовать
         * для корректного отображения результата?
         */

        int a = 5;
        int b = 17;
        int c = 55;
        int arifmAverage = (a + b + c)/3;
        System.out.println("arifmAverage = " + arifmAverage);
        double arifmAverageDouble = (double) (a + b + c)/3;
        System.out.println("arifmAverageDouble = " + arifmAverageDouble);

        /**
         * При делении целочисленных значений отбрасывается остаток и для его
         * корректного о тображения лучше чтобы в результате выводился тип double
         * а аргументы перед делением лучше также привести к типу double.
         */

    }
}
