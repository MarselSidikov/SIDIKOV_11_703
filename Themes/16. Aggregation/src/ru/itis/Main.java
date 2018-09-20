package ru.itis;

import ru.itis.case1.CashTerminal;

public class Main {

    public static void main(String[] args) {
        CashTerminal terminal = new CashTerminal(30);
        terminal.giveSomeMoney(20);
    }
}
