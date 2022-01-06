package com.company.JavaBase.Lesson1.Exercise_3;

import java.util.Scanner;

public class Book {
    /**
     * Задание 3
     *
     * Используя IDEA, создайте проект c пакетом. Требуется: Создать класс Book(Main). Создать классы Title,
     * Author и Content, каждый из которых должен содержать одно строковое поле и метод void show ().
     * Реализуйте возможность добавления в книгу названия книги, имени автора и содержания. Выведите на
     * экран при помощи метода show() название книги, имя автора и Содержание.
     */
    Title t;
    Author a;
    Content c;

void show(){
    System.out.print("Название книги: ");
    t.show();
    System.out.print(", её автор: ");
    a.show();
    System.out.print(", её содержание: ");
    c.show();
}
    public static void main(String[] args) {
        Book book = new Book();                         // создаём объект книгу
        book.t = new Title();                           // создаём её переменную - низвание книги
        Scanner scanner = new Scanner(System.in);       // создаём сканер
        System.out.print("Введите название книги: ");   // просим позьвователя внести название книги
        book.t.title = scanner.nextLine();
        book.a = new Author();                          // создаём её переменную - автор книги
        System.out.print("Введите автора книги: ");     // просим позьвователя внести автора книги
        book.a.author = scanner.nextLine();
        book.c = new Content();                         // создаём её переменную - содержание книги
        System.out.print("Введите содержание книги: "); // просим пользователя внести содержание книги
        book.c.content = scanner.nextLine();


        book.show();                                    // выводи в консоль все созданные переменные
    }
}
class Title{
    String title;
    void show(){
        System.out.print(title);
    }

}
class Author{
    String author;
    void show(){
        System.out.print(author);
    }
}
class Content{
    String content;
    void show(){
        System.out.println(content);
    }
}
