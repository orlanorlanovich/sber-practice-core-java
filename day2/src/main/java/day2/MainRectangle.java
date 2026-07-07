package day2;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0, 3.0);

        System.out.println("Default rectangle:");
        r1.display();

        System.out.println("\nCustom rectangle:");
        r2.display();
    }
}