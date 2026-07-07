package day1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой вес: ");
        double n = scanner.nextInt();
        double moon = n * 0.17;

        System.out.printf("Ваш вес на луне:  %.2f кг%n", moon);

        scanner.close();
    }
}