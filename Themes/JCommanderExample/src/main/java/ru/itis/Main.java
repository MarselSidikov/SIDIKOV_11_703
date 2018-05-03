package ru.itis;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 03.05.2018
 * ru.itis.Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {

    @Parameter(names = "-classFolder")
    private String classFolder;

    public static void main(String[] args) {
        Main main = new Main();
        JCommander.newBuilder()
                .addObject(main)
                .build()
                .parse(args);
        main.run();
    }

    public void run() {
        try {
            Files.list(Paths.get(classFolder))
            .forEach(file -> System.out.println(file.getFileName().toString()));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
