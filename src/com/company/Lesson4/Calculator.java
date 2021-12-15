package com.company.Lesson4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /**
         * Задание 2
         *
         * Используя IntelliJ IDEA, создайте класс Calculator. Напишите программу – консольный калькулятор.
         * Создайте две переменные с именами operand1 и operand2. Задайте переменным некоторые произвольные значения.
         * Предложите пользователю ввести знак арифметической операции. Примите значение, введенное пользователем и
         * поместите его в строковую переменную sign. Для организации выбора алгоритма вычислительного процесса,
         * используйте переключатель switch. Выведите на экран результат выполнения арифметической операции. В случае
         * использования операции деления, организуйте проверку попытки деления на ноль. И если таковая имеется, то
         * отмените выполнение арифметической операции и уведомите об ошибке пользователя.
         */

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
}
