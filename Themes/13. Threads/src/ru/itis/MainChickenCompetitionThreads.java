package ru.itis;

/**
 * 11.04.2018
 * MainChickenCompetitionThreads
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Пусть есть три потока a, b, c
 * Пусть внутри потока a запущены потоки b и с
 * Если внутри потока a у объектов потоков b и c вызвать join
 * то поток a будет ждать полного заврешения этих потоков
 */
public class MainChickenCompetitionThreads {
    public static void main(String[] args) {
        EggThread eggThread = new EggThread("EggThread");
        ChickenThread chickenThread = new ChickenThread("ChickenThread");

        eggThread.start();
        chickenThread.start();

        try {
            eggThread.join();
            chickenThread.join();
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " Я батя");
        }
    }
}
