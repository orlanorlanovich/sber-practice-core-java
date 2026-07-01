package day3;

public class Triangle extends Figure {
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        super(p1);
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP2() { return p2; }
    public void setP2(Point p2) { this.p2 = p2; }
    public Point getP3() { return p3; }
    public void setP3(Point p3) { this.p3 = p3; }

    private double sideLength(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }

    @Override
    public double area() {
        double a = sideLength(point, p2);
        double b = sideLength(p2, p3);
        double c = sideLength(p3, point);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return sideLength(point, p2) + sideLength(p2, p3) + sideLength(p3, point);
    }

    @Override
    public String toString() {
        return "Треугольник с вершинами " + point + ", " + p2 + ", " + p3;
    }
}