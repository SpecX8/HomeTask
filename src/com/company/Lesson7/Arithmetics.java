package com.company.Lesson7;

import java.util.Scanner;

public class Arithmetics {

    /**
     * Задание 2
     *
     * Используя IntelliJ IDEA, создайте класс Arithmetics. Создайте четыре метода для выполнения арифметических
     * операций, с именами: add – сложение, sub – вычитание, mul – умножение, div – деление. Каждый метод должен
     * принимать два целочисленных аргумента и выводить на экран результат выполнения арифметической операции
     * соответствующей имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль.
     * Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак
     * арифметической операции, для выполнения вычислений.
     */

    static void add(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    static void sub(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }

    static void mul(int a, int b) {
        System.out.println("a * b = " + (a * b));
    }

    static void div() {
        // объявляем первую переменную
        int operand1;
        // инициализируюм Scanner
        Scanner scanner = new Scanner(System.in);
        // предланаем пользователю ввести первое число
        System.out.println("Enter the first number:  ");
        // присваиваем первое число со сканера в переменную operand1
        operand1 = scanner.nextInt();
        // обьявляем вторую переменную
        int operand2;
        // предланаем пользователю ввести второе число
        System.out.println("Enter the second number: ");
        // присваиваем второе число со сканера в переменную operand2
        operand2 = scanner.nextInt();
        // предлагаем пользователю выбрать операцию из списка
        System.out.println("Select the action you want to perform from multiply from the list: ");
        System.out.println("+, -, *, /, %");
        // объявляем строковую переменную для выбора требуемой операции над переменными
        String sign;
        // присваиваем значение со сканера в строковую переменную sign
        sign = scanner.next();
        System.out.println("operand1 = " + operand1 + ", operand2 = " + operand2 + ", sing = " + sign);
        switch (sign) {
            case "+": {
                System.out.println("operand1  + operand2 = " + (operand1 + operand2));
                break;
            }
            case "-": {
                System.out.println("operand1  - operand2 = " + (operand1 - operand2));
                break;
            }
            case "*": {
                System.out.println("operand1  * operand2 = " + (operand1 * operand2));
                break;
            }
            case "/": {
                // проверяем значение второго оператора на ноль, если пользователь
                // ввёл ноль то информируем его об этом и выходим из цикла, если все в порядке то продолжаем
                // выполнение программы
                if (operand2 == 0) {
                    System.out.println("You cannot divide by zero ");
                } else {
                    System.out.println("operand1  / operand2 = " + (operand1 / operand2));
                }
                break;
            }
            case "%": {
                System.out.println("operand1  % operand2 = " + (operand1 % operand2));
                break;
            }
            default: {
                // если пользователь ввёл оператор не из списка то информируем его об этом
                System.out.println("You entered an operation not from the suggested list");
            }
        }
    }

    public static void main(String[] args) {
        add(5,7);
        sub(7,5);
        mul(5,7);
        div();
    }
}

