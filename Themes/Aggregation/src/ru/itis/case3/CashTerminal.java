package ru.itis.case3;

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

    public CashTerminal(int sum, CheckPrinter printer) {
        this.sum = sum;
        this.printer = printer;
    }

    public void giveSomeMoney(int cash) {
        if (cash <= sum) {
            sum -= cash;
            printer.printCheck(cash);
        } else throw new IllegalArgumentException("Sorry honey, no money");
    }
}
