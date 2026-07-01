package day2;

public class BookDemo {
    public static void main(String[] args) {
        Author author1 = new Author("Лев Толстой", "мужской", "tolstoy@mail.ru");
        Author author2 = new Author("Джоан Роулинг", "женский", "rowling@gmail.com");

        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Гарри Поттер", author2, 1997);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println();

        System.out.println("Автор: " + book1.getAuthor().getName());
        System.out.println("Email: " + book1.getAuthor().getEmail());

        book1.setYear(1870);
        System.out.println("Обновленная книга: " + book1);
    }
}