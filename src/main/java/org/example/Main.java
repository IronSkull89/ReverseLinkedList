package org.example;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.print();
        list.reverse();
        list.print();
    }
}