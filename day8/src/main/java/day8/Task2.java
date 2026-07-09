package day8;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Анна", 20, 1));
        students.add(new Student("Борис", 22, 2));
        students.add(new Student("Вика", 21, 1));
        students.add(new Student("Глеб", 23, 3));
        students.add(new Student("Дина", 24, 2));
        students.add(new Student("Егор", 25, 3));
        students.add(new Student("Женя", 19, 1));
        students.add(new Student("Зина", 26, 3));

        // группируем по курсам
        Map<Integer, List<Student>> groups = new HashMap<>();
        for (Student s : students) {
            if (!groups.containsKey(s.course)) {
                groups.put(s.course, new ArrayList<>());
            }
            groups.get(s.course).add(s);
        }

        // считаем средний возраст по каждому курсу
        for (Map.Entry<Integer, List<Student>> entry : groups.entrySet()) {
            int course = entry.getKey();
            List<Student> list = entry.getValue();

            int sum = 0;
            for (Student s : list) {
                sum += s.age;
            }
            double avg = (double) sum / list.size();

            System.out.println("Курс " + course + ": " + list.size() + " чел, средний возраст = " + avg);
        }
    }
}