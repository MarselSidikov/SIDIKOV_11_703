package ru.itis;

/**
 * 15.02.2018
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LinkedList implements List{

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int count;

    public LinkedList() {
        this.count = 0;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    // TODO: реализовать
    @Override
    public void addToBegin(Object element) {

    }

    @Override
    public void add(Object element) {
//        Node newNode = new Node(element);
//
//        if (head == null) {
//            head = newNode;
//        } else {
//            // создаем переменную, которая указывает
//            //  на начало списка
//            Node current = head;
//            // пока следующий после текущего есть
//            while (current.next != null) {
//                // идем дальше
//                current = current.next;
//            }
//            current.next = newNode;
//        }
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    @Override
    public void remove(Object element) {

    }

    // TODO: реализовать
    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public int size() {
        return count;
    }
}
