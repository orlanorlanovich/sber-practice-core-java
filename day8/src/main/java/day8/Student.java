package day8;

public class Student {
    String name;
    int age;
    int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String toString() {
        return name + " (" + age + ", " + course + " курс)";
    }
}