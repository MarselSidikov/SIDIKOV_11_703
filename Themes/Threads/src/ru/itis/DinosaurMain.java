package ru.itis;

/**
 * 11.04.2018
 * DinosaurMain
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class DinosaurMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new DinosaurRunnable());
        thread.start();
    }
}
