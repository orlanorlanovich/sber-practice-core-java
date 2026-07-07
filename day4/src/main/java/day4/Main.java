package day4;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
        pair.setValue(26);
        System.out.println("New value: " + pair.getValue());
    }
}