package day2;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        m1.setValue(0, 0, 1);
        m1.setValue(0, 1, 2);
        m1.setValue(1, 0, 3);
        m1.setValue(1, 1, 4);

        Matrix m2 = new Matrix(2, 2);
        m2.setValue(0, 0, 5);
        m2.setValue(0, 1, 6);
        m2.setValue(1, 0, 7);
        m2.setValue(1, 1, 8);

        System.out.println("Матрица 1:");
        m1.print();

        System.out.println("Матрица 2:");
        m2.print();

        System.out.println("Сложение:");
        m1.add(m2).print();

        System.out.println("Умножение на 2:");
        m1.multiply(2).print();

        System.out.println("Умножение матриц:");
        m1.multiply(m2).print();
    }
}