package ru.itis;

/**
 * 07.02.2019
 * Card
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Card {
    private String password;

    public Card(String password) {
        this.password = password;
    }

    public boolean isCorrectPassword(String password) {
        return this.password.equals(password);
    }
}
