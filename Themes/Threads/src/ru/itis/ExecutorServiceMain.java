package ru.itis;

/**
 * 11.04.2018
 * ExecutorServiceMain
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ExecutorServiceMain {
    public static void main(String[] args) {
        SimpleExecutorService service = new SimpleExecutorService();
        service.submitTask(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("I'm runnable!");
            }
        });

        service.submitTask(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("I'm runnable too!");
            }
        });
    }
}
