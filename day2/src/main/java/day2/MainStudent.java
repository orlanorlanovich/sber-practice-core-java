package day2;

public class MainStudent {
    public static void main(String[] args) {
        Group group = new Group(5);

        Student s1 = new Student("Anna", new int[]{5, 4, 5});
        Student s2 = new Student("Mike", new int[]{3, 4, 3});
        Student s3 = new Student("Kate", new int[]{5, 5, 5});

        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);

        System.out.println("All students:");
        group.displayAll();

        Student best = group.findBestStudent();
        System.out.println("\nBest student:");
        best.display();
    }
}