package com.company.Lesson4;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        /**
         * Задание 4
         *
         * Используя IntelliJ IDEA, создайте класс Translator. Напишите программу русско-английский переводчик.
         * Программа знает 10 слов о погоде. Требуется, чтобы пользователь вводил слово на русском языке, а программа
         * давала ему перевод этого слова на английском языке. Если пользователь ввел слово, для которого отсутствует
         * перевод, то следует вывести сообщение, что такого слова нет.
         */

        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word about weather: ");
        word = scanner.next();
        switch (word) {
            case "ветер": {
                System.out.println("Wind");
                break;
            }
            case "солнце": {
                System.out.println("Sun");
                break;
            }
            case "дождь":{
                System.out.println("Rain");
                break;
            }
            case "снег":{
                System.out.println("Snow");
                break;
            }
            case "град":{
                System.out.println("Cold");
                break;
            }
            case "Жарко":{
                System.out.println("Hot");
                break;
            }
            case "туман":{
                System.out.println("Fog");
                break;
            }
            case "облачно":{
                System.out.println("cloudy");
                break;
            }
            case "мороз":{
                System.out.println("freezing");
                break;
            }
            case "гололед":{
                System.out.println("ice");
                break;
            }
            default:{
                System.out.println("There is no such word in the dictionary.");
            }
        }
    }
}
