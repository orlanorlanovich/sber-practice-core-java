package day2;

public class MainPerson {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);

        for (Person p : people) {
            p.displayInfo();
        }
    }
}