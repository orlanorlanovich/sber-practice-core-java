package day2;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.length;
    }

    public void display() {
        System.out.print("Student: " + name + ", Grades: ");
        for (int g : grades) {
            System.out.print(g + " ");
        }
        System.out.println(", Average: " + getAverageGrade());
    }
}