package ru.itis.compare;

/**
 * 21.02.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User implements Comparable<User> {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
