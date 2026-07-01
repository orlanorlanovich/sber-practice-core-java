package day2;

public class PhoneDemo {
    public static void main(String[] args) {
        // Создание телефонов
        Phone phone1 = new Phone("+7(999)123-45-67", "iPhone 15", 171.0);
        Phone phone2 = new Phone("+7(888)987-65-43", "Samsung Galaxy S24");
        Phone phone3 = new Phone();

        // toString
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();

        // receiveCall
        phone1.receiveCall("Анна");
        phone2.receiveCall("Михаил");
        phone1.receiveCall("Елена", "+7(900)111-22-33");
        System.out.println();

        // getNumber
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println();

        // sendMessage
        String[] numbers = {"+7(900)111-22-33", "+7(900)444-55-66", "+7(900)777-88-99"};
        phone1.sendMessage(numbers);
    }
}