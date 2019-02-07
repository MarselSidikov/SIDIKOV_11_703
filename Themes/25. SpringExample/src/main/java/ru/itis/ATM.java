package ru.itis;

/**
 * 07.02.2019
 * ATM
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ATM {
    private int sum;
    private Terminal terminal;

    public ATM(int sum, Terminal terminal) {
        this.sum = sum;
        this.terminal = terminal;
    }

    public int giveMoney(Card card, String password, int amount) {
        if (card.isCorrectPassword(password)) {
            if (this.sum >= amount) {
                this.sum -= amount;
                return amount;
            } else {
                terminal.messageOnNoMoney();
            }
        } else {
            terminal.messageOnIncorrectPassword();
        }
        return -1;
    }
}
