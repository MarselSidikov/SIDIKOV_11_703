package ru.itis;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 19.04.2018
 * MainFileOutputStream
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/**
 * OutputStream - абстрактный класс для вывода информации
 * в поток
 * Имеет метод
 * <p>
 * public abstract void write(int b)
 * <p>
 * Если значение b больше значения байта, старшие биты обрезаются
 * public void write(byte b[]) - для записи массива байтов
 */
public class MainFileOutputStream {
    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("output.txt");
            String text = "Hello, how are you?";
            byte bytes[] = text.getBytes();
            output.write(bytes);
            output.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

    }
}
