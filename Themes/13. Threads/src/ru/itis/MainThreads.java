package ru.itis;

/**
 * 11.04.2018
 * MainThreads
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Thread - класс, экземпляр которого представляет поток
 * Имеет статический метод currentThread(), возвращает
 * объект потока из которого был вызван метод
 *
 * Thread.sleep() - усыпляет поток, из которого был вызван данный метод
 */
public class MainThreads {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        System.out.println("Before sleep");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("After sleep");
    }
}
