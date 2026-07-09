package day8;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 150.5, "2024-03-15"));
        orders.add(new Order(2, 200.0, "2024-03-20"));
        orders.add(new Order(3, 75.3, "2024-04-01"));
        orders.add(new Order(4, 300.0, "2024-04-10"));
        orders.add(new Order(5, 120.0, "2024-03-25"));
        orders.add(new Order(6, 50.0, "2024-04-05"));
        orders.add(new Order(7, 450.0, "2024-03-18"));

        // ищем макс и мин
        Order maxOrder = orders.get(0);
        Order minOrder = orders.get(0);

        for (Order o : orders) {
            if (o.sum > maxOrder.sum) {
                maxOrder = o;
            }
            if (o.sum < minOrder.sum) {
                minOrder = o;
            }
        }

        System.out.println("Заказ с макс суммой: " + maxOrder);
        System.out.println("Заказ с мин суммой: " + minOrder);

        // сумма заказов за март 2024
        double sumMarch = 0;
        for (Order o : orders) {
            if (o.date.startsWith("2024-03")) {
                sumMarch += o.sum;
            }
        }
        System.out.println("Сумма заказов за март: " + sumMarch);

        // сумма за апрель
        double sumApril = 0;
        for (Order o : orders) {
            if (o.date.startsWith("2024-04")) {
                sumApril += o.sum;
            }
        }
        System.out.println("Сумма заказов за апрель: " + sumApril);
    }
}