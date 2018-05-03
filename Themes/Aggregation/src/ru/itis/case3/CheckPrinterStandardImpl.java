package ru.itis.case3;

import java.time.LocalDateTime;

/**
 * 26.04.2018
 * CheckPrinter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CheckPrinterStandardImpl implements CheckPrinter {
    public void printCheck(int cash) {
        System.out.println("Give cash " + cash + " " + LocalDateTime.now());
    }

    public void killClient() {
        System.out.println("AHAHAHHAHHAHAHA!! POW POW!!!");
    }
}
