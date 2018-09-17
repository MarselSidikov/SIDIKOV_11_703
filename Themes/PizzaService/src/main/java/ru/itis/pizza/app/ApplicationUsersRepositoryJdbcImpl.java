package ru.itis.pizza.app;

import ru.itis.pizza.repositories.UsersRepository;
import ru.itis.pizza.repositories.UsersRepositoryJdbcImpl;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 17.09.2018
 * ApplicationUsersRepositoryJdbcImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ApplicationUsersRepositoryJdbcImpl {
    private static final String URL = "jdbc:postgresql://localhost:5432/pizza_db_11_703";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty007";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        UsersRepository usersRepository = new UsersRepositoryJdbcImpl(connection);
        System.out.println(usersRepository.find(2L));
    }
}
