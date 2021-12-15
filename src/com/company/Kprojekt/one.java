package com.company.Kprojekt;

public class one {
    public static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 123456;
        int b = sumDigits(a);
        System.out.println(b);
    }
}
