package day2;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("Неизвестно", "Неизвестно", 0.0);
    }


    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + " с номера " + phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String[] phoneNumbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    @Override
    public String toString() {
        return "Phone{number='" + number + "', model='" + model + "', weight=" + weight + "}";
    }
}