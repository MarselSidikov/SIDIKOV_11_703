package ru.itis;

public class Main {
    public static void main(String[] args) {
        // 4 указателя, они все NULL
        Node a; // ~ Node *a
        Node b; // ~ Node *b
        Node c; // ~ Node *c
        Node d; // ~ Node *d
        Node e; // ~ Node *e
        Node f; // ~ Node *f
        Node g; // ~ Node *g
        Node h; // ~ Node *h
        Node i; // ~ Node *i

        a = new Node(); // теперь a указывает на объект типа Node
        b = new Node();
        c = new Node();
        d = new Node();
        e = new Node();
        f = new Node();
        g = new Node();
        h = new Node();
        i = new Node();


        a.value = 10; // a->value = 10
        b.value = 11;
        c.value = 12;
        d.value = 13;
        e.value = 14;
        f.value = 15;
        g.value = 16;
        h.value = 17;
        i.value = 18;

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;

        Node current = a;

        while (current != null) {
            System.out.println(current.value + " ");
            current = current.next;
        }
    }
}
