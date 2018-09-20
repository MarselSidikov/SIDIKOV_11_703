package ru.itis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 19.04.2018
 * MainWriteOneByteOnCyrillic
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainWriteOneByteOnCyrillic {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("output.txt", true);
        char c = 'П';
        outputStream.write((byte)c);
        outputStream.close();
    }
}
