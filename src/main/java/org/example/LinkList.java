package org.example;

public class LinkList {
    private Node header;
    private Node tail;

    public LinkList(int value) {
        header = new Node(value);
        tail = header;
    }

    public void add(int value) {
        tail.setNext(new Node(value));
        tail.getNext().setPrevious(tail);
        tail = tail.getNext();
    }

    public void reverse() {
        Node temp = header;
        Node node = header;
        if (header != tail) {
            node = node.getNext();
            while (node != tail) {
                if (node.getPrevious() == header) node.getPrevious().setNext(null);
                else node.getPrevious().setNext(node.getPrevious().getPrevious());
                node.getPrevious().setPrevious(node);

                node = node.getNext();
            }

            if (node.getPrevious() == header) node.getPrevious().setNext(null);
            else node.getPrevious().setNext(node.getPrevious().getPrevious());
            node.getPrevious().setPrevious(node);

            node.setNext(node.getPrevious());
            node.setPrevious(null);

            header = node;
            tail = temp;
        }
    }

    public void print() {
        Node node = header;
        while (node != tail) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.print(node.getValue() + "\n");
    }
}
