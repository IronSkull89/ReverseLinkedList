package org.example;

public class Node {
    private int value;
    private Node previous;
    private Node next;
    public Node(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public void setPrevious(Node node) {
        this.previous = node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
