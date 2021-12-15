package com.company.Lesson8;

import java.util.Scanner;

public class Bank {
    /**
     * Задание 2
     * <p>
     * Используя IntelliJ IDEA, создайте класс Bank. Представьте, что вы реализуете программу для банка,
     * которая помогает определить, погасил ли клиент кредит или нет. Допустим, ежемесячная сумма платежа
     * должна составлять 100 грн. Клиент должен выполнить 7 платежей, но может платить реже большими суммами.
     * Т.е., может двумя платежами по 300 и 400 грн. Закрыть весь долг.
     * Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом банка.
     * Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма переплаты, сообщение
     * об отсутствии долга).
     */

    private static void bank() {
        int[] debt = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0, credit = 0; i < debt.length; i++) {
            System.out.print("Внесите платёж по кредиту: ");
            credit = scanner.nextInt();
            debt[i] = credit;
            System.out.println("Платёж № " + (i + 1) + " принят в размере " + credit);
            int sum = 0;
            for (int j = 0; j < debt.length; j++) {
                sum = sum + debt[j];
                //System.out.println("сумма взносов равна: " + sum);
            }
            if (sum >= 700) {
                System.out.println("Кредит выплачен");
                break;
            } else {
                System.out.println("Остаток по кредиту: " + (700 - sum));
            }
        }
    }

    public static void main(String[] args) {
        bank();
    }
}

