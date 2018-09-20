package ru.itis.equals;

/**
 * 01.03.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User {
    private int age;
    private int height;

    public User(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof User)) {
            return false;
        }
        if (object == this) {
            return true;
        }

        User that = (User)object;
        return this.age == that.age && this.height == that.height;
    }
}
