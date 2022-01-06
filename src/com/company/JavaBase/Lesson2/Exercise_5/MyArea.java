package com.company.JavaBase.Lesson2.Exercise_5;

public class MyArea {
    /**
     * Задание 5
     *
     * Используя Intelij IDEA создать проект, пакет. Создать класс MyArea, в нем объявить константу
     * PI = 3.14 и статический метод areaOfCircle, который должен принимать радиус и используя PI
     * посчитать площадь круга. Создать класс Main, где запустить данный метод.
     */

    final static double PI = 3.14;
    static int radius;
    static double areaOfCircle(int radius){
        return radius*radius*PI;
    }

    public static void main(String[] args) {
        radius = 15;
        System.out.println("Площадь круга радиусом " + radius + " равна: " + areaOfCircle(radius));

    }
}
