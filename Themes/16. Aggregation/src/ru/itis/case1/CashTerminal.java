package ru.itis.case1;

import java.time.LocalDateTime;

/**
 * 26.04.2018
 * CashTerminal
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CashTerminal extends CheckPrinter {
    private int sum;

    public CashTerminal(int sum) {
        this.sum = sum;
    }

    public void giveSomeMoney(int cash) {
        if (cash <= sum) {
            sum -= cash;
            printCheck(cash);
        } else throw new IllegalArgumentException("Sorry honey, no money");
    }
}
