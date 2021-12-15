package com.company.Lesson9;

public class Arrays {
    /**
     * Задание 5
     *
     * Используя IntelliJ IDEA, создайте класс Arrays. Создайте массив размерностью в 10 элементов,
     * выведите на экран все элементы массива в обратном порядке.
     */

    static int[] myReverse(int[] array) {
        int j = 0;
        int[] res = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--, j++) {
            res[j] = array[i];
            System.out.print(res[j] + " ");
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {15, 8, -15, 5, 90, 20, 0, 40, 5, -13};
        System.out.println("Исходный массив");
        for (int i = 0; i<arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Массив в обратном порядке");
        myReverse(arr);
    }
}
