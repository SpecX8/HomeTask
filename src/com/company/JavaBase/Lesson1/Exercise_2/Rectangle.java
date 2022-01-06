package com.company.JavaBase.Lesson1.Exercise_2;

import java.util.Scanner;

public class Rectangle {
    /**
     * Задание 2
     * <p>
     * Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
     * создать два поля, описывающие длины сторон double side1, double side2. Создать два метода, вычисляющие
     * площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр прямоугольника –
     * double perimeterCalculator (double side1, double side2). Написать программу, которая принимает от
     * пользователя длины двух сторон прямоугольника и выводит на экран периметр и площадь.
     */

    // объявляем пермую переменную
    static double side1;
    // объявляем вторую переменную
    static double side2;

    // метод для вычислениея площади прямоугольника
    static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    // метод для вычисления переметра прямоуголника
    static double perimetrCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую сторону прямоугольника: ");
        side1 = scanner.nextDouble();
        System.out.print("Введите вторую сторону прямоугольника: ");
        side2 = scanner.nextDouble();
        System.out.println("Площадь прямоугольника равна " + areaCalculator(side1, side2) +
                ", периметр прямоугольника равен " + perimetrCalculator(side1, side2) + ".");

    }
}
