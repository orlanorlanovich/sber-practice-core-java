package day2;

public class Group {
    private Student[] students;
    private int count;

    public Group(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Group is full!");
        }
    }

    public void displayAll() {
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public Student findBestStudent() {
        if (count == 0) {
            return null;
        }
        Student best = students[0];
        for (int i = 1; i < count; i++) {
            if (students[i].getAverageGrade() > best.getAverageGrade()) {
                best = students[i];
            }
        }
        return best;
    }
}