package day7;

import java.io.*;

public class RemoveSpaces {
    public static void main(String[] args) throws Exception {
        // правильный путь - от корня проекта
        BufferedReader reader = new BufferedReader(new FileReader("day7/src/main/resources/Borodino.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("day7/src/main/resources/Borodino_clean.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String s = line.trim();
            String res = "";
            String[] words = s.split(" ");
            for (String w : words) {
                if (!w.isEmpty()) {
                    res += w + " ";
                }
            }
            writer.write(res.trim());
            writer.newLine();
        }

        reader.close();
        writer.close();
        System.out.println("Готово");
    }
}