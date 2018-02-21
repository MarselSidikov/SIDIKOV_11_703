package ru.itis.compare;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 21.02.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        User marsel = new User(24, "Марсель");
        User dasha = new User(18, "Даша");
        User ilyas = new User(19, "Ильяс");
        User andrey = new User(20, "Андрей");

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        User[] users = {marsel, dasha, ilyas, andrey};
        Integer[] integers = {33, 12, 5, 2, 1, 1, 4, 5, 56};
        String[] strings = {"Анита", "Марсель", "Арина", "Ирина", "Марина", "Даша"};
        Scanner[] scanners = {scanner2, scanner1, scanner3, scanner4};

        Sorter.sort(users);
        Sorter.sort(integers);
        Sorter.sort(strings);
        Sorter.sort(scanners);
        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(strings));
    }
}
