package ru.itis;

import java.io.IOException;
import java.io.InputStream;

/**
 * 19.04.2018
 * MainReadOneByteOnCyrillic
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainReadOneByteOnCyrillic {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;

        int code = inputStream.read();

        System.out.println((char)code);
    }
}
