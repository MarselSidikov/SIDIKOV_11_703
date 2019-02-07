package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 07.02.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
//        Terminal terminal = new BadTerminalImpl();
//        Terminal terminal = new SimpleTerminalImpl();
//        Terminal terminal = context.getBean("terminal", Terminal.class);
//        ATM atm = new ATM(100, terminal);

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ATM atm = context.getBean("atm", ATM.class);
        Card card = new Card("7777");

        atm.giveMoney(card, "7777", 150);
    }
}
