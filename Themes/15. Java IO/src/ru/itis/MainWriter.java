package ru.itis;

import java.io.*;

/**
 * 19.04.2018
 * MainWriter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainWriter {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(new FileOutputStream("output.txt",true));
        writer.write('П');
        writer.close();
    }
}
