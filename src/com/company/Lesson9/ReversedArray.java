package com.company.Lesson9;

public class ReversedArray {
    /**
     * Задание 3
     *
     * Используя IntelliJ IDEA, создайте класс ReversedArray. Требуется: 1) Создать метод myReverse(int [] array),
     * который принимает в качестве аргумента массив целочисленных элементов и возвращает инвертированный массив
     * (элементы массива в обра1тном порядке). 2) Создайте метод int [] subArray(int [] array, int index, int count).
     * Метод возвращает часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе
     * index, размерностью, которая соответствует значению аргумента count. Если аргумент count содержит
     * значение больше чем количество элементов, которые входят в выбираемую часть исходного массива
     * (от указанного индекса index, до индекса последнего элемента), то при формировании нового массива
     * размерностью в count, заполните единицами те элементы, которые не были скопированы из исходного массива.
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

    static int[] subArray(int[] array, int index, int count) {
        int[] res = new int[count];
        int a = array.length;
        for (int i = 0; i < res.length; i++) {
            int temp = (i + index) < a ? (array[i + index]) : (1);
            res[i] = temp;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(" " + res[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 9, -15, 2, -4, 0, 12};
        System.out.print("Исходный миссив: ");
        for (int a : array) {
            System.out.print(" " + a);
        }
        System.out.println();
        System.out.print("Инвертированный массив: ");
        myReverse(array);

        System.out.println();
        subArray(array, 5, 10);
    }
}
