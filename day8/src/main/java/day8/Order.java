package day8;

public class Order {
    int id;
    double sum;
    String date;

    public Order(int id, double sum, String date) {
        this.id = id;
        this.sum = sum;
        this.date = date;
    }

    public String toString() {
        return id + " " + sum + " " + date;
    }
}