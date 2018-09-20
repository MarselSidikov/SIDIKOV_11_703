package ru.itis;

/**
 * 15.02.2018
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

import java.util.Iterator;

/**
 * Реализация списка на основе узлов (связного списка)
 */
public class LinkedList<T> implements List<T> {

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class Node {
        T value;
        Node next;

        Node(T value) {
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
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public T get(int index) {
        if (index >= count) {
            throw new IllegalArgumentException();
        }
        Node current = this.head;
        int i = 0;

        while (i < index) {
            current = current.next;
            i++;
        }

        return current.value;
    }

    // TODO: реализовать
    @Override
    public void addToBegin(T element) {

    }

    @Override
    public void add(T element) {
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
    public void remove(T element) {

    }

    // TODO: реализовать
    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public int size() {
        return count;
    }
}
