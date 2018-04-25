package ru.itis.serialize;

import java.io.*;

/**
 * 19.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human = new Human(24, "Marsel", true, 185);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("human.data"));

        outputStream.writeObject(human);
        outputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("human.data"));
        Human humanFromFile = (Human) objectInputStream.readObject();
        System.out.println(humanFromFile.getName() + " " + humanFromFile.getAge());
    }
}
