package com.company.JavaBase.Lesson2.Exercise_4;

public class Car {
    /**
     * Задание 4
     *
     * Используя Intelij IDEA создать проект, пакет. (Заново!) Создать класс Машина с полями год(int),
     * скорость(double), вес(int) цвет(String). Создать конструктор по умолчанию, конструктор с 1-м параметром,
     * 2-я, 3-я, 4-я. Перегрузить конструкторы вызывая конструктор из конструктора. Создать класс Main,
     * в котором создать экземляры класса Машина с разными параметрами.
     */

    // Создаём поля класса
    int yar;
    double speed;
    int weight;
    String colour;

    // Создаём конструктор по умолчанию
    public  Car(){
        this(2006,180.0,1840,"blue");
    }
    // Создаём конструктор с одним параметром
    public Car(int yar) {
        this(yar, 170.0,1650,"black");
    }
    // Создаём конструктор с двумя параметрами
    public Car(int yar, String colour) {
        this(yar, 210.0,1750, colour);
    }
    // Создаём конструктор с тремя параметрами
    public Car(int yar, double speed, int weight) {
        this(yar, speed, weight, "yellow");
    }
    // Создаём конструктор с четырмя параметрами
    public Car(int yar, double speed, int weight, String colour) {
        this.yar = yar;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Car car1 = new Car(); // создаём объект по конструктору по умолчанию
        Car car2 = new Car((2005)); // создаём объект по конструктору с одним параметром
        Car car3 = new Car(2010, "white"); // создаём объект по конструктору с двумя параметрами
        Car car4 = new Car(2011,220.0, 1720); // создаём объект по конструктору с тремя параметрами
        Car car5 = new Car(2015,240.0, 1790,"red"); // создаём объект по конструктору с четырьмя параметрами

        System.out.println("car1.yar = " + car1.yar);
        System.out.println("car1.speed = " + car1.speed);
        System.out.println("car1.weight = " + car1.weight);
        System.out.println("car1.colour = " + car1.colour);
        System.out.println("*******************************");
        System.out.println("car2.yar = " + car2.yar);
        System.out.println("car2.speed = " + car2.speed);
        System.out.println("car2.weight = " + car2.weight);
        System.out.println("car2.colour = " + car2.colour);
        System.out.println("*******************************");
        System.out.println("car3.yar = " + car3.yar);
        System.out.println("car3.speed = " + car3.speed);
        System.out.println("car3.weight = " + car3.weight);
        System.out.println("car3.colour = " + car3.colour);
        System.out.println("*******************************");
        System.out.println("car4.yar = " + car4.yar);
        System.out.println("car4.speed = " + car4.speed);
        System.out.println("car4.weight = " + car4.weight);
        System.out.println("car4.colour = " + car4.colour);
        System.out.println("*******************************");
        System.out.println("car5.yar = " + car5.yar);
        System.out.println("car5.speed = " + car5.speed);
        System.out.println("car5.weight = " + car5.weight);
        System.out.println("car5.colour = " + car5.colour);
    }
}
