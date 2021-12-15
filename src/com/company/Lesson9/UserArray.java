package com.company.Lesson9;

public class UserArray {
    /**
     *Задание 4
     *
     * Используя IntelliJ IDEA, создайте класс UserArray. Требуется: Создать метод, который будет выполнять
     * увеличение длины массива переданного в качестве аргумента, на 1 элемент. Элементы массива, должны
     * сохранить свое значение и порядок индексов. Создайте метод, который принимает два аргумента, первый
     * аргумент – типа int [] array, второй аргумент – типа int value. В теле метода реализуйте возможность
     * добавления второго аргумента метода в массив по индексу 0, при этом длина нового массива, должна
     * увеличиться на 1 элемент, а элементы получаемого массива в качестве первого аргумента должны
     * скопироваться в новый массив начиная с индекса 1
     */
    static int[] arr(int[] array) {
        int[] res = new int[array.length + 1];
        int a = array.length;
        for (int i = 0; i < res.length; i++) {
            int temp;
            if ((i + 1) <= a) temp = array[i];
            else temp = 0;
            res[i] = temp;
        }
        for (int i = 0; i<res.length; i++){
            System.out.print(" " + res[i]);
        }
        return res;
    }

    static int[] arrPlus(int[] array, int value) {
        int[] res = new int[array.length + 1];
        int a = array.length;
        for (int i = 0; i < a; i++) {
            res[i+1] = array[i];
        }
        res[0] = value;
        for (int i = 0; i<res.length; i++){
            System.out.print(" " + res[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 9, -15, 2, -4, 0, 12};
        System.out.println("Исходный массив");
        for (int i = 0; i<array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("Массив с добавлением одной ячейки в конце");
        int [] temp = arr(array);
        System.out.println();
        System.out.println("Массив с добовлением ячейки в начале и заполнением её по значению");
        int [] temp2 = arrPlus(array, 50);
    }
}
