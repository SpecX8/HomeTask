package com.company.JavaStarter.Lesson5;

public class DeMorganaComparison {
    public static void main(String[] args) {
        byte a = 0b01100101;
        byte b = 0b01011010;
        System.out.println((a|b));
        System.out.println(~((~a) & (~b)));
    }
}
