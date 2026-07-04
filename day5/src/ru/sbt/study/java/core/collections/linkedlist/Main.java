package ru.sbt.study.java.core.collections.linkedlist;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== ТЕСТИРОВАНИЕ LINKEDLIST ===\n");

        // Базовый тест - используем add(T element) без индекса
        System.out.println("1. Базовое добавление и получение:");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Элемент 0: " + list.get(0));
        System.out.println("Элемент 1: " + list.get(1));
        System.out.println("Элемент 2: " + list.get(2));
        System.out.println("Размер: " + list.size() + "\n");

        //Тест максимального размера
        System.out.println("2. Тест максимального размера (maxSize=3):");
        LinkedList<String> limitedList = new LinkedList<>(3);
        limitedList.add("A");
        limitedList.add("B");
        limitedList.add("C");
        System.out.println("Размер после добавления 3 элементов: " + limitedList.size());

        try {
            limitedList.add("D");
        } catch (LinkedListException e) {
            System.out.println("Исключение: " + e.getMessage() + "\n");
        }

        //Тест доступа к несуществующему элементу
        System.out.println("3. Тест get() с несуществующим индексом:");
        try {
            limitedList.get(10);
        } catch (LinkedListException e) {
            System.out.println("Исключение: " + e.getMessage() + "\n");
        }

        // Тест удаления
        System.out.println("4. Тест удаления:");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Первый");
        list2.add("Второй");
        list2.add("Третий");
        System.out.println("До удаления, размер: " + list2.size());
        String removed = list2.remove(1);
        System.out.println("Удален элемент: " + removed);
        System.out.println("После удаления, размер: " + list2.size() + "\n");

        // Тест удаления с несуществующим индексом
        System.out.println("5. Тест remove() с несуществующим индексом:");
        try {
            list2.remove(10);
        } catch (LinkedListException e) {
            System.out.println("Исключение: " + e.getMessage() + "\n");
        }

        // Тест добавления по индексу
        System.out.println("6. Тест добавления по индексу:");
        LinkedList<String> list3 = new LinkedList<>();
        list3.add("Ноль");
        list3.add("Два");
        list3.add("Три");
        System.out.println("До вставки: размер=" + list3.size());
        list3.add(1, "Один"); // Вставляем на позицию 1
        System.out.println("После вставки 'Один' на позицию 1: размер=" + list3.size());
        System.out.println("Элемент 0: " + list3.get(0));
        System.out.println("Элемент 1: " + list3.get(1));
        System.out.println("Элемент 2: " + list3.get(2));
        System.out.println("Элемент 3: " + list3.get(3) + "\n");

        // Тест добавления по неверному индексу
        System.out.println("7. Тест add(index) с неверным индексом:");
        try {
            list3.add(10, "Десятый");
        } catch (LinkedListException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}