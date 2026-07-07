package day1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 100: ");
        int num = scanner.nextInt();

        if (num < 1 || num > 100) {
            System.out.println("Ошибка: число должно быть от 1 до 100");
            scanner.close();
            return;
        }

        String roman = "";

        // Сотни
        while (num >= 100) {
            roman += "C";
            num -= 100;
        }

        // Десятки
        if (num >= 90) {
            roman += "XC";
            num -= 90;
        }
        if (num >= 50) {
            roman += "L";
            num -= 50;
        }
        if (num >= 40) {
            roman += "XL";
            num -= 40;
        }
        while (num >= 10) {
            roman += "X";
            num -= 10;
        }

        // Единицы
        if (num >= 9) {
            roman += "IX";
            num -= 9;
        }
        if (num >= 5) {
            roman += "V";
            num -= 5;
        }
        if (num >= 4) {
            roman += "IV";
            num -= 4;
        }
        while (num >= 1) {
            roman += "I";
            num -= 1;
        }

        System.out.println("Римская запись: " + roman);

        scanner.close();
    }
}