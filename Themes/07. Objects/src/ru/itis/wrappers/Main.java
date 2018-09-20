package ru.itis.wrappers;

/**
 * 01.03.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        // boxing -> примитивное значение упаковывается в ссылочное
        Integer integer = new Integer(15);

        // autoboxing
        Integer integer1 = 15;

        // unboxing -> ссылочное значение распаковывается в притимтивное
        int i = integer.intValue();

        // autounboxing
        int i1 = integer;

        Integer a = 135;
        Integer b = 135;

        System.out.println(a == b);
    }
}
