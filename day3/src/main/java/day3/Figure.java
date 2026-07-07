package day3;

public abstract class Figure {
    protected Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public Point getPoint() { return point; }
    public void setPoint(Point point) { this.point = point; }

    public abstract double area();
    public abstract double perimeter();
}