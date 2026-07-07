package day4;

import java.util.*;

public class Benchmark {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();  // хеш-сет
        TreeSet<Integer> t = new TreeSet<>();  // дерево-сет

        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) h.add(i);
        System.out.println("HashSet add: " + (System.currentTimeMillis() - s) + "ms (добавление)");

        s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) t.add(i);
        System.out.println("TreeSet add: " + (System.currentTimeMillis() - s) + "ms (добавление)");

        s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) h.contains(i);
        System.out.println("HashSet get: " + (System.currentTimeMillis() - s) + "ms (получение)");

        s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) t.contains(i);
        System.out.println("TreeSet get: " + (System.currentTimeMillis() - s) + "ms (получение)");
    }
}