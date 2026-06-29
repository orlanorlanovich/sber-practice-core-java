package ru.sber.base.syntax;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Загадываем случайную букву от A до Z
        char secret = (char) ('A' + Math.random() * 26);

        System.out.println("Я загадал букву от A до Z. Попробуй угадать!");

        while (true) {
            System.out.print("Введите букву: ");
            char guess = scanner.nextLine().toUpperCase().charAt(0);

            if (guess == secret) {
                System.out.println("Right!");
                break;
            } else if (guess < secret) {
                System.out.println("You're too low ");
            } else {
                System.out.println("You're too high ");
            }
        }

        scanner.close();
    }
}