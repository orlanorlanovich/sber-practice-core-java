package day2;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Красный");
        System.out.println(circle);
        System.out.println("Площадь: " + circle.area());
        System.out.println("Периметр: " + circle.perimeter());
    }
}