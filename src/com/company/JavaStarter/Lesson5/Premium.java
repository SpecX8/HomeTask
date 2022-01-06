package com.company.JavaStarter.Lesson5;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        double salary = 100.0;
        int experience;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of service to calculate the salary: ");
        experience = scanner.nextInt();
        if (experience < 5) {
            salary += (salary * 0.1);
        } else if (5 <= experience && experience < 10) {
            salary += (salary * 0.15);
        } else if (10 <= experience && experience < 15) {
            salary += (salary * 0.25);
        } else if (15 <= experience && experience < 20) {
            salary += (salary * 0.35);
        } else if (20 <= experience && experience < 25) {
            salary += (salary * 0.45);
        } else if (experience >= 25) {
            salary += (salary * 0.50);
        }
        System.out.println("If work experience is " +  experience + ", then the salary " + salary);
    }
}
