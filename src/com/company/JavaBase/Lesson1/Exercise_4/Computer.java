package com.company.JavaBase.Lesson1.Exercise_4;

public class Computer {
    /**
     * Задание 4
     * Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов Computers
     * размером 5. Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop).
     */
    public static void main(String[] args) {

        Computer[] Computers = new Computer[5];

        for (int i = 0; i < Computers.length; i++) {
            Computers[i] = new Computer();
        }
        System.out.println();
        for (int i = 0; i < Computers.length; i++) {
            System.out.println("Обьект номер " + (i + 1) + " создан, " + Computers[i]);
        }

    }
}
