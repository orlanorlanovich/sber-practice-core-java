package day2;

public class PizzaDemo {
    public static void main(String[] args) {
        PizzaOrder pizza1 = new PizzaOrder("Аль-Капчоне", PizzaSize.BIG, true, "Ярославская 101");
        PizzaOrder pizza2 = new PizzaOrder("Маргарита", PizzaSize.MEDIUM, false, "Ленина 25");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println();

        pizza1.order();
        pizza1.order();
        pizza1.cancel();
        pizza1.cancel();
        System.out.println();

        pizza2.order();
        pizza2.setAddress("Пушкина 10");
        pizza2.setSauce(true);
        System.out.println("Обновленный заказ: " + pizza2);
    }
}