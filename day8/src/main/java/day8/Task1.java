package day8;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java is cool");
        list.add("python is easy");
        list.add("I love Java");
        list.add("javascript");
        list.add("c++");
        list.add("JAVA");
        list.add("hello world");

        System.out.println("Было: " + list);
        System.out.println("Результат:");

        for (String s : list) {
            if (s.toLowerCase().contains("java")) {
                System.out.println(s.toUpperCase());
            }
        }
    }
}