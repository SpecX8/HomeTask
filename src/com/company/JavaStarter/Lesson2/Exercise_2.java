package com.company.JavaStarter.Lesson2;

import java.math.BigDecimal;

public class Exercise_2 {
    public static void main(String[] args) {

        double pi = 3.141592653;
        double e = 2.7182818284590452; // при выводе будет потеря точности в виде потери последней цифры
        /**
         *  Если необходимо просто вывести в консоль для наглядности данное число
         *  то можно представить его просто в виде типа String и при выводе потери
         *  не будет
         */

        String e1 = "2.7182818284590452";

        /**
         * Если же мы в дальнейшем будем производить расчеты то можно использовать
         * работу с большими числами импортируя библиотеку java.math.BigDecimal
         * которые выходят за пределы допустимых значений для типов double
         * для чисел с плавающей точкой
         */

        BigDecimal e2 = new BigDecimal("2.7182818284590452");

        System.out.println("pi = " + pi);
        System.out.println("e = " + e);
        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
    }
}
