package ru.itis.strings;

/**
 * 01.03.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        // "Марсель" - литеральная (встречается прямо в коде) строка
        // для нее Java создаст один объект и поместит в так называемый
        // StringPool для экономии памяти и увеличения скорости работы
        // s1 и s2 -> указывают на один объект
        String s1 = "Марсель";
        String s2 = "Марсель";

        // тут вы явно создаете два отдельных объекта, поэтому
        // == для них false
        String a1 = new String("Марсель");
        String a2 = new String("Марсель");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);

        // intern -> возвращает каноническое представление строки
        // Java смотрит, есть ли такая строка в StringPool
        // если ее нет -> она ее туда помещает и возвращает новую ссылку
        // на эту строку
        System.out.println(s1.intern() == s2.intern());
        System.out.println(a1.intern() == a2.intern());
    }
}
