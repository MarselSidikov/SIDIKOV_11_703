package ru.itis.case3;

/**
 * 26.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        CheckPrinter printer = new CheckPrinterErrorOutImpl();
        CheckPrinter printer1 = new CheckPrinterStandardImpl();

        CashTerminal terminal = new CashTerminal(30, printer1);
        terminal.giveSomeMoney(10);
    }
}
