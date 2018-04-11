package ru.itis;

/**
 * 11.04.2018
 * MainEggThread
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Потоки чередуются случайным образом
 */
public class MainEggThread {
    public static void main(String[] args) {
        EggThread eggThread = new EggThread("EggThread");
        eggThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " Я батя");
        }
    }
}
