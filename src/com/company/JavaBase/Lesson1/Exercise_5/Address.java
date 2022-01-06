package com.company.JavaBase.Lesson1.Exercise_5;

public class Address {
    /**
     * Задание 5
     *
     * Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Address. В теле класса
     * требуется создать поля: index, country, city, street, house, apartment. Для каждого поля, создать
     * метод с двумя методами доступа (get, set) Создать экземпляр класса Address. В поля экземпляра записать
     * информацию о почтовом адресе. Выведите на экран значения полей, описывающих адрес.
     */

    // объявляем поля класса
    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    // создаём get и set этих полей
    public int getIndex() {return index;}
    public void setIndex(int index) {this.index = index;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}
    public int getHouse() {return house;}
    public void setHouse(int house) {this.house = house;}
    public int getApartment() {return apartment;}
    public void setApartment(int apartment) {this.apartment = apartment;}

    public static void main(String[] args) {

        // создаём экземпляр класса Address
        Address address = new Address();

        // записываем информацию о почтовом адресе
        address.setIndex(190000);
        address.setCountry("Russian");
        address.setCity("St.Petersburg");
        address.setStreet("Dekabristov");
        address.setHouse(15);
        address.setApartment(26);

        // выведим на экран значения полей, описывающих адрес.
        System.out.println("Адрес :" + " индекс " + address.getIndex() +", страна "+ address.getCountry() +
                ", город "+ address.getCity() + ", улица " + address.getStreet() + ", номер дома " +
                address.getHouse() + ", номер квартиры " + address.getApartment());
    }
}
