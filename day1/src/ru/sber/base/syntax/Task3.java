package ru.sber.base.syntax;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        String num = scanner.nextLine();

        String reversed = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reversed += num.charAt(i);
        }

        if (num.equals(reversed)) {
            System.out.println(num + " - палиндром");
        } else {
            System.out.println(num + " - не палиндром");
        }

        scanner.close();
    }
}
