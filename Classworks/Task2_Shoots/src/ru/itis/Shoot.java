package ru.itis;

/**
 * 08.02.2018
 * Shoot
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Shoot {
    private int x;
    private int y;

    public Shoot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private double calcRadius() {
        return Math.sqrt(x * x + y * y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
