package ru.itis.case1;

/**
 * 26.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        CashTerminal terminal = new CashTerminal(30);
        terminal.giveSomeMoney(10);
        terminal.killClient();
    }
}
