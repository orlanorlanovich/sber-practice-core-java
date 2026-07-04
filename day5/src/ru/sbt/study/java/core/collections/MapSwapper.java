package ru.sbt.study.java.core.collections;

import java.util.HashMap;
import java.util.Map;

public class MapSwapper {

    public static <K, V> Map<V, K> swap(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Один", 1);
        map.put("Два", 2);
        map.put("Три", 3);

        System.out.println("Исходная: " + map);
        System.out.println("Результат: " + swap(map));
    }
}