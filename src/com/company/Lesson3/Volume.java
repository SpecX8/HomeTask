package com.company.Lesson3;

public class Volume {
    public static void main(String[] args) {
        /**
         * Задание 4
         *
         * Используя IntelliJ IDEA, создайте класс Volume. Напишите программу расчета объема - V и площади
         * поверхности -S цилиндра. Объем V цилиндра радиусом – R и высотой – h, вычисляется
         * по формуле: V = πR2 h Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h)
         * Результаты расчетов выведите на экран.
         */
        final double PI = 3.141592653589793;
        double R = 7.0;
        double h = 5;
        double V = PI * R * R * h;
        System.out.println("Объем V цилиндра = " + V);
        double S = 2 * PI * R * (R + h);
        System.out.println("Площадь S поверхности цилиндра = " + S);
    }
}
