package ru.itis.serialize;

import java.io.Serializable;

/**
 * 19.04.2018
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human implements Serializable {
    private int age;
    private String name;
    private boolean isMan;
    private double height;

    public Human(int age, String name, boolean isMan, double height) {
        this.age = age;
        this.name = name;
        this.isMan = isMan;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
