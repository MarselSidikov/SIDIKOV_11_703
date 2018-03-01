package ru.itis.equals;

public class Main {

    public static void assertEquals(Object a, Object b) {
        if (!a.equals(b)) {
            throw new IllegalArgumentException("not equals");
        }
    }

    public static void main(String[] args) {
        User marsel = new User(24, 185);
        User marsel2 = new User(24, 185);

        System.out.println(marsel == marsel2);
        System.out.println(marsel.equals(marsel2));

        assertEquals(marsel, marsel2);
    }
}
