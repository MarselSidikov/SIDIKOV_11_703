package ru.itis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Stream в контексте Java IO
 * Stream (поток) - последовательность байт
 * По умолчанию, когда программа запущена
 * Открывается три потока:
 * Stream.out
 * Stream.in
 * Stream.err
 *
 * InputStream - абстрактный класс, описывающий логику
 * работы с потоками
 *
 * Метод считывает значение байта из потока.
 * Если с потока считать нельзя, метод возвращает
 * -1. Чтобы не было коллизий с байтом, имеющим
 * значение 255 возвращается int. Таким образом значение возвращаемого
 * байта лежит в диапазоне 0-255.
 * public abstract int read() throws IOException;
 *
 * Считывает массив байтов из потока в массив b
 * Возвращает сколько считал
 * public int read(byte b[]) throws IOException
 *
 * Класс InputStream имеет абстрактный метод, который
 * должен описывать процесс считывания байтов.
 * Остальные методы не абстрактные, поскольку
 * содержат логику с использованием абстрактного read()
 *
 * FileInputStream
 *
 * Используется для файлов обычно нетекстовых
 */
public class MainFileInputStream {

    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("input.txt");
//            int byteFromInput = input.read();
//            while (byteFromInput != -1) {
//                System.out.print((char)byteFromInput);
//                byteFromInput = input.read();
//            }

            Path pathOfFile = Paths.get("input.txt");
            long sizeOfFile = Files.size(pathOfFile);

            byte bytes[] = new byte[(int)sizeOfFile];

            input.read(bytes);
            String lineFromFile = new String(bytes);
            System.out.println(lineFromFile);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

    }
}
