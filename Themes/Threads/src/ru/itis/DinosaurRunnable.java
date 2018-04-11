package ru.itis;

/**
 * 11.04.2018
 * DinosaurRunnable
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class DinosaurRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("У меня коротенькие лапки, но люлей пропишу");
        }
    }
}
