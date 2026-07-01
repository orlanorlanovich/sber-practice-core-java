package day2;

public class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean sauce;
    private String address;
    private boolean accepted;

    public PizzaOrder(String name, PizzaSize size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
        this.accepted = false;
    }

    public void order() {
        if (accepted) {
            System.out.println("Заказ уже принят");
        } else {
            accepted = true;
            System.out.print("Заказ принят. ");
            System.out.print(size + " пицца «" + name + "» ");
            System.out.print(sauce ? "с соусом " : "без соуса ");
            System.out.println("на адрес " + address);
        }
    }

    public void cancel() {
        if (accepted) {
            System.out.println("Заказ отменен");
            accepted = false;
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public PizzaSize getSize() { return size; }
    public void setSize(PizzaSize size) { this.size = size; }
    public boolean isSauce() { return sauce; }
    public void setSauce(boolean sauce) { this.sauce = sauce; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public boolean isAccepted() { return accepted; }

    @Override
    public String toString() {
        return "Пицца: " + size + " «" + name + "», " +
                (sauce ? "с соусом" : "без соуса") +
                ", адрес: " + address +
                (accepted ? " (принят)" : " (не принят)");
    }
}