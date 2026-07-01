package ru.sber.base.syntax;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения ax² + bx + c = 0");
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите c: ");
        double c = scanner.nextDouble();

        // Проверка, что это действительно квадратное уравнение
        if (a == 0) {
            System.out.println("Это не квадратное уравнение (a = 0)");
            scanner.close();
            return;
        }

        // Вычисляем дискриминант
        double D = b * b - 4 * a * c;

        System.out.println("Дискриминант D = " + D);

        if (D > 0) {
            // Два корня
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Два корня:");
            System.out.println("x₁ = " + x1);
            System.out.println("x₂ = " + x2);
        } else if (D == 0) {
            // Один корень
            double x = -b / (2 * a);
            System.out.println("Один корень (D = 0):");
            System.out.println("x = " + x);
        } else {
            // Корней нет
            System.out.println("Корней нет (D < 0)");
        }

        scanner.close();
    }
}