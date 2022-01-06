package com.company.JavaStarter.Lesson9;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        /**
         * Задание 2
         *
         * Используя IntelliJ IDEA, создайте класс CustomerArray. Требуется: Создать массив размера N элементов,
         * заполнить его произвольными целыми значениями (размер массива задает пользователь). Вывести на экран:
         * наибольшее значение массива, наименьшее значение массива, общую сумму всех элементов, среднее
         * арифметическое всех элементов, вывести все нечетные значения.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер мессива N: ");
        int n = scanner.nextInt();
        double[] N = new double[n];
        for (int i = 0; i < N.length; i++) {
            System.out.print("Введите " + i + " элемент массива: ");
            N[i] = scanner.nextInt();
        }
        System.out.print("Вы ввели следующие элементы массива: ");
        for (int i = 0; i < N.length; i++) {
            System.out.print(" " + N[i]);
        }
        System.out.println();
        double min = N[0];
        for (int i = 0; i < N.length; i++){
            if (N[i] < min)
                min = N[i];
        }
        System.out.println("min = " + min);
        double max = N[0];
        for (int i = 0; i < N.length; i++){
            if (N[i] > max)
                max = N[i];
        }
        System.out.println("max = " + max);
        double sum = 0;
        for(int i = 0; i < N.length; i++){
            sum+= N[i];
        }
        System.out.println("sredneArifm = " + sum/n);
        System.out.print("Нечётные элементы массива N: ");
        for(int i = 0; i < N.length; i++){
            if(N[i]%2!=0){
                System.out.print(" " + N[i]);
            }
        }
    }
}
