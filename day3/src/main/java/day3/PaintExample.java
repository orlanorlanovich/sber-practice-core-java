package day3;

public class PaintExample {
    public static void main(String[] args) {
        // Создаем фигуры
        Circle circle = new Circle(new Point(0, 0), 5);
        Rectangle rect = new Rectangle(new Point(1, 1), 4, 6);
        Square square = new Square(new Point(2, 2), 3);
        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(3, 0),
                new Point(0, 4)
        );

        // Рисуем фигуры
        FigureUtil.draw(circle);
        FigureUtil.draw(rect, Color.RED);
        FigureUtil.draw(square, Color.BLUE);
        FigureUtil.draw(triangle, Color.GREEN);

        // Выводим площади и периметры
        System.out.println("\nПлощади:");
        System.out.println("Круг: " + FigureUtil.area(circle));
        System.out.println("Прямоугольник: " + FigureUtil.area(rect));
        System.out.println("Квадрат: " + FigureUtil.area(square));
        System.out.println("Треугольник: " + FigureUtil.area(triangle));

        System.out.println("\nПериметры:");
        System.out.println("Круг: " + FigureUtil.perimeter(circle));
        System.out.println("Прямоугольник: " + FigureUtil.perimeter(rect));
        System.out.println("Квадрат: " + FigureUtil.perimeter(square));
        System.out.println("Треугольник: " + FigureUtil.perimeter(triangle));
    }
}