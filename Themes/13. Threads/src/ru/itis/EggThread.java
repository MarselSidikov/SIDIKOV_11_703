package ru.itis;

/**
 * 11.04.2018
 * EggThread
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class EggThread extends Thread {
    public EggThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " says" + " egg");
        }
    }
}
