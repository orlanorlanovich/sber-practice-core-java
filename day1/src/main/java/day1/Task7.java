package day1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество членов последовательности (2 < n < 100): ");
        int n = scanner.nextInt();

        if (n <= 2 || n >= 100) {
            System.out.println("Ошибка: n должно быть в диапазоне 2 < n < 100");
            scanner.close();
            return;
        }

        long a = 0;  // Первый член
        long b = 1;  // Второй член

        System.out.print("Первые " + n + " чисел Фибоначчи: ");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        scanner.close();
    }
}