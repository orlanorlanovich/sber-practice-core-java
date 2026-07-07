package day7;

import java.io.*;
import java.util.*;

public class SortNames {
    public static void main(String[] args) throws Exception {
        // 1. Создаём файл с именами прямо в коде (чтобы точно были русские буквы)
        String fileName = "day7/src/main/resources/listNames.txt";
        BufferedWriter create = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
        String[] data = {"Сергей", "Мария", "Анна", "Валерий", "Анастасия", "Павел", "Иван", "Яна", "Дарья", "Ксения", "Андрей"};
        for (String s : data) {
            create.write(s);
            create.newLine();
        }
        create.close();

        // 2. Читаем файл
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
        List<String> names = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                names.add(line.trim());
            }
        }
        reader.close();

        System.out.println("До сортировки: " + names);

        // 3. Пузырьковая сортировка
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).compareTo(names.get(j)) > 0) {
                    String temp = names.get(i);
                    names.set(i, names.get(j));
                    names.set(j, temp);
                }
            }
        }

        System.out.println("После сортировки: " + names);

        // 4. Запись результата
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("day7/src/main/resources/listNames_sorted.txt"), "UTF-8"));
        for (String n : names) {
            writer.write(n);
            writer.newLine();
        }
        writer.close();

        System.out.println("Отсортировано " + names.size() + " имён");
    }
}