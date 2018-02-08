package ru.itis;

/**
 * 08.02.2018
 * Circle
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Circle {
    private int radius;
    private int score;

    public Circle(int radius, int score) {
        this.radius = radius;
        this.score = score;
    }

    public int getRadius() {
        return radius;
    }

    public int getScore() {
        return score;
    }
}
