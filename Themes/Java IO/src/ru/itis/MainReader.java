package ru.itis;

import java.io.*;

/**
 * 19.04.2018
 * MainReader
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * Reader - абстрактный класс, имеющий метод
 *
 * public int read() считывающий не один байт, а символ
 */
public class MainReader {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        int code = reader.read();
        System.out.println((char)code);
    }
}
