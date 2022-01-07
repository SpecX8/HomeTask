package com.company.JavaBase.Lesson3.Exercise_3;

public class Vehicle {
    /**
     * Задание 3
     *
     * Используя IntelliJ IDEA, создайте проект. Требуется: Создать класс Vehicle. В теле класса создайте поля:
     * координаты и параметры средств передвижения (цена, скорость, год выпуска). Создайте 3 производных
     * класса Plane, Саг и Ship. Для класса Plane должна быть определена высота и количество пассажиров.
     * Для класса Ship – количество пассажиров и порт приписки. Написать программу, которая выводит на
     * экран информацию о каждом средстве передвижения.
     */
    public Vehicle(String coordinates, int price, int speed, int year) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    String coordinates;
    int price;
    int speed;
    int year;
    void info(){
        System.out.println("*****");
        System.out.println("Год выпуска: " + year + ", цена: " + price + ", место расположения: "
                + coordinates + ", скорость: " + speed +". ");
    }
}

class Plane extends Vehicle{
    public Plane(String coordinates, int price, int speed, int year, int height, int numberOfPassengers) {
        super(coordinates, price, speed, year);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    int height;
    int numberOfPassengers;
    @Override
    void info(){
        super.info();
        System.out.println("Высота полёта: " + height + ", колличество пассажиров: " + numberOfPassengers);
    }
}
class Car extends Vehicle{
    public Car(String coordinates, int price, int speed, int year) {
        super(coordinates, price, speed, year);
    }

    @Override
    void info() {
        super.info();
    }
}
class Ship extends Vehicle{
    public Ship(String coordinates, int price, int speed, int year, String homePort, int numberOfPassengers) {
        super(coordinates, price, speed, year);
        this.homePort = homePort;
        this.numberOfPassengers = numberOfPassengers;
        System.out.println();
    }

    String homePort;
    int numberOfPassengers;
    @Override
    void info(){
        super.info();
        System.out.println("Порт приписки: " + homePort + ", колличество пассажиров: " + numberOfPassengers);
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        Vehicle v1 = new Car("California", 15000, 80, 1995 );
        Vehicle v2 = new Plane("Rio", 15000000, 700, 2008, 10000,108);
        Vehicle v3 = new Ship("Sidney", 25000000, 70, 2000, "Deli", 800);
        Vehicle[] vehicles = {v1, v2, v3};
        for(Vehicle vehicle : vehicles){
            vehicle.info();
        }
    }
}
