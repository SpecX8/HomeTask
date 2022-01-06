package com.company.JavaBase.Lesson2.Exercise_2;

public class Car {
    /**
     * Задание 2
     *
     * Используя Intelij IDEA создать проект, пакет. Создать класс Машина с полями год(int), цвет(String).
     * Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами. Создать класс Main в котором
     * создать экземпляры вызывая разные конструкторы.
     */
    // Создаём поля класса
    int yar;
    String colour;
    // Создаём конструктор по умолчанию
    public  Car(){
    }
    // Создаём конструктор с одним параметром
    public Car(int yar) {
        this.yar = yar;
    }
    // Создаём конструктор с двумя параметрами
    public Car(int yar, String colour) {
        this.yar = yar;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Car car1 = new Car(); // создаём объект по конструктору по умолчанию
        car1.yar = 2006;
        car1.colour = "blue";
        Car car2 = new Car((2005)); // создаём объект по конструктору с одним параметром
        car2.colour = "black";
        Car car3 = new Car(2010, "white"); // создаём объект по конструктору с двумя параметрами

        System.out.println("car1.yar = " + car1.yar);
        System.out.println("car1.colour = " + car1.colour);
        System.out.println("*******************************");
        System.out.println("car2.yar = " + car2.yar);
        System.out.println("car2.colour = " + car2.colour);
        System.out.println("*******************************");
        System.out.println("car3.yar = " + car3.yar);
        System.out.println("car3.colour = " + car3.colour);

    }
}
