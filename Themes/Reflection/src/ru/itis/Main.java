package ru.itis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // stringClass объектная переменная
        // которая содержит ссылку на объект
        // который представляет собой описание класса
        // как объекта
        // Class stringClass = String.class;
//        Scanner scanner = new Scanner(System.in);
//        String className = scanner.nextLine();
        Class aClass = Class.forName("ru.itis.User");
        Field allFields[] = aClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println(field.getType() + " " + field.getName());
        }

        Field ageField = aClass.getDeclaredField("age");
        User user = new User("Marsel", 24);
        ageField.setAccessible(true);
        ageField.set(user, 25);
        System.out.println(user.getAge());

        Method method = aClass.getMethod("makeOlder", int.class);
        method.invoke(user, 33);
        System.out.println(user.getAge());

        User newUser = (User)aClass.newInstance();
        System.out.println(newUser.getAge() + " " + newUser.getName());

        Constructor<User> constructor = aClass.getConstructor(String.class, int.class);
        newUser = constructor.newInstance("Anita", 18);
        System.out.println(newUser.getAge() + " " + newUser.getName());
    }
}
