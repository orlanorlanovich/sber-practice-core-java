package day5;

// Собственное исключение
class LinkedListException extends RuntimeException {
    public LinkedListException(String message) {
        super(message);
    }
}

public class LinkedList<T> {

    Node<T> root;
    private int size = 0;
    private int maxSize = Integer.MAX_VALUE;

    public LinkedList() {
        root = null;
    }

    public LinkedList(int maxSize) {
        this();
        this.maxSize = maxSize;
    }

    // Добавление в конец
    public void add(T element) {
        if (size >= maxSize) {
            throw new LinkedListException("Превышен максимальный размер списка: " + maxSize);
        }

        if (root == null) {
            root = new Node<>(element);
        } else {
            Node<T> lastNode = findLast();  // <-- Добавили <T>
            lastNode.setNext(new Node<>(element));  // <-- Добавили <>
        }
        size++;
    }

    // Добавление по индексу
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new LinkedListException("Индекс " + index + " вне диапазона. Размер списка: " + size);
        }

        if (size >= maxSize) {
            throw new LinkedListException("Превышен максимальный размер списка: " + maxSize);
        }

        if (index == 0) {
            Node<T> newNode = new Node<>(element);
            newNode.setNext(root);
            root = newNode;
        } else {
            Node<T> current = root;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            Node<T> newNode = new Node<>(element);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    private Node<T> findLast() {  // <-- Добавили <T>
        if (root == null)
            return null;

        Node<T> lastNode = root;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

    public T get(int index) {  // <-- Изменили Object на T
        if (index < 0 || index >= size) {
            throw new LinkedListException("Индекс " + index + " вне диапазона. Размер списка: " + size);
        }

        Node<T> currentNode = root;  // <-- Добавили <T>
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();
    }

    // Удаление по индексу
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new LinkedListException("Индекс " + index + " вне диапазона. Размер списка: " + size);
        }

        if (index == 0) {
            T value = root.getValue();
            root = root.getNext();
            size--;
            return value;
        }

        Node<T> current = root;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Node<T> toRemove = current.getNext();
        T value = toRemove.getValue();
        current.setNext(toRemove.getNext());
        size--;
        return value;
    }

    public int size() {
        return size;
    }
}