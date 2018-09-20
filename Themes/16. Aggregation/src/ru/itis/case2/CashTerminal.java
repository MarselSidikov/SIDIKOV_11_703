package ru.itis.case2;

/**
 * 26.04.2018
 * CashTerminal
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CashTerminal {
    private int sum;
    private CheckPrinter printer;

    public CashTerminal(int sum) {
        this.sum = sum;
        printer = new CheckPrinter();
    }

    public void giveSomeMoney(int cash) {
        if (cash <= sum) {
            sum -= cash;
            printer.printCheck(cash);
        } else throw new IllegalArgumentException("Sorry honey, no money");
    }
}
