package day3;

public class Square extends Rectangle {
    public Square(Point point, double side) {
        super(point, side, side);
    }

    @Override
    public String toString() {
        return "Квадрат с углом " + point + ", сторона=" + getWidth();
    }
}