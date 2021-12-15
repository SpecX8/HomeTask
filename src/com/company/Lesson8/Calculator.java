package com.company.Lesson8;

public class Calculator {
    static int calculate(int a, int b, int c) {
        return (a + b + c) / 5;
    }

    public static void main(String[] args) {
        int i = calculate(15,80,75);
        System.out.println("i = " + i);

    }
}
