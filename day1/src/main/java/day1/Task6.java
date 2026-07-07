package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int n = scanner.nextInt();

        // Проверка на минимальные значения
        if (n < 2) {
            System.out.println(n + " не является простым числом");
            scanner.close();
            return;
        }

        boolean isPrime = true;

        // Проверяем делители от 2 до корня из n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;  // Выходим из цикла, так как уже нашли делитель
            }
        }

        if (isPrime) {
            System.out.println(n + " является простым числом");
        } else {
            System.out.println(n + " не является простым числом");
        }

        scanner.close();
    }
}