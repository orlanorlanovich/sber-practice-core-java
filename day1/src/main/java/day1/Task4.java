package day1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трёхзначное число: ");
        int n = scanner.nextInt();

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int ones = n % 10;

        int sum = hundreds + tens + ones;

        System.out.println("Сумма цифр числа " + n + " = " + sum);

        scanner.close();
    }
}