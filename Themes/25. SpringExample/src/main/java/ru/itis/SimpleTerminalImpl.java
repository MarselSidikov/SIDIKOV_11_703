package ru.itis;

/**
 * 07.02.2019
 * SimpleTerminalImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleTerminalImpl implements Terminal {
    public void messageOnNoMoney() {
        System.out.println("Денег нет, подойдите позже.");
    }

    public void messageOnIncorrectPassword() {
        System.out.println("ЛОВИТЕ ВОРА!!! ОН ТУТ");
    }
}
