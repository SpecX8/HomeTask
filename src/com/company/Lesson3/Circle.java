package com.company.Lesson3;

public class Circle {
    public static void main(String[] args) {

        /**
         * Задание 3
         *
         * Используя IntelliJ IDEA, создайте класс Circle. Создайте константу с именем PI (число π «пи»),
         * создайте переменную радиус с именем – r. Используя формулу πR2 , вычислите площадь круга и
         * выведите результат на экран.
         */

        final double PI = 3.141592653589793;
        double r = 15.0;
        double radius = PI * r * r;
        System.out.println("radius = " + radius);
    }
}
