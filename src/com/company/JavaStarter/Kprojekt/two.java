package com.company.JavaStarter.Kprojekt;

public class two {
    private static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int a = 7654321;
        System.out.println("a = " + a);
        int b = reverseNumber(a);
        System.out.println("b = " + b);
    }
}
