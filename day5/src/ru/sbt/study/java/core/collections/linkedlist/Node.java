package ru.sbt.study.java.core.collections.linkedlist;

public class Node<T> {

    private T value;
    private Node<T> next;  // <-- Добавили <T>

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node(T value, Node<T> next) {  // <-- Добавили <T>
        this.value = value;
        this.next = next;
    }

    public T getValue() {  // <-- Изменили Object на T
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {  // <-- Добавили <T>
        return next;
    }

    public void setNext(Node<T> next) {  // <-- Добавили <T>
        this.next = next;
    }
}