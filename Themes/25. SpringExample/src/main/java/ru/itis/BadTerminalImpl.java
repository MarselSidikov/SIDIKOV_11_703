package ru.itis;

/**
 * 07.02.2019
 * BadTerminalImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class BadTerminalImpl implements Terminal {
    public void messageOnNoMoney() {
        System.err.println("Денег нет, но вы держитесь.");
    }

    public void messageOnIncorrectPassword() {
        System.err.println("ПЕТУХ!");
    }
}
