package ru.itis.pizza.app;

import java.sql.*;
import java.util.Scanner;

/**
 * 10.09.2018
 * ApplicationJdbcDemo
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ApplicationJdbcDemo {
    private static final String URL = "jdbc:postgresql://localhost:5432/pizza_db_11_703";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty007";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select id, first_name from pizza_user");
//        resultSet.next();
//        System.out.println(resultSet.getString("first_name"));
//        resultSet.next();
//        System.out.println(resultSet.getString("first_name"));
        while (resultSet.next()) {
            System.out.print(resultSet.getLong("id") + " ");
            System.out.println(resultSet.getString("first_name"));
        }

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String email = scanner.nextLine();

        String insertQuery = "insert into pizza_user (first_name, last_name, email) " +
                "values ('" + firstName + "','" + lastName + "','" + email + "');";
        System.out.println(insertQuery);
        int affectedRows = statement.executeUpdate(insertQuery);
        System.out.println("Affected - "  +affectedRows);
        resultSet = statement.executeQuery("select id, first_name from pizza_user");
        while (resultSet.next()) {
            System.out.print(resultSet.getLong("id") + " ");
            System.out.println(resultSet.getString("first_name"));
        }
    }
}
