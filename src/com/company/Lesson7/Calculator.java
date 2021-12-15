package com.company.Lesson7;

public class Calculator {
    /**
     * Задание 5
     *
     * Используя IntelliJ IDEA, создайте класс Calculator. Создайте метод с именем calculate, который принимает
     * в качестве параметров три целочисленных аргумента и выводит на экран среднее арифметическое значений
     * аргументов.
     */
    static double calculate(int a, int b, int c){
        double result = (double) (a + b + c)/3;
        System.out.println("Среднее трёх чисел = " + result);
        return result;
    }

    public static void main(String[] args) {
        calculate(15,47,3);
    }
}
