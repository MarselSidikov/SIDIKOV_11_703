package ru.itis.pizza.repositories;

import lombok.SneakyThrows;
import ru.itis.pizza.models.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 17.09.2018
 * UsersRepositoryJdbcImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersRepositoryJdbcImpl implements UsersRepository {

    private Connection connection;

//    //language=SQL
//    private static final String SQL_FIND_BY_ID =
//            "select * from pizza_user where pizza_user.id  = ";

    public UsersRepositoryJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User findOneByEmail(String email) {
        return null;
    }

    @Override
    public void save(User model) {

    }

    @Override
    @SneakyThrows
    public User find(Long id) {
        String query = "select * from pizza_user where id = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();
        return User.builder()
                .id(resultSet.getLong("id"))
                .hashPassword(resultSet.getString("hash_password"))
                .address(resultSet.getString("address"))
                .email(resultSet.getString("email"))
                .firstName(resultSet.getString("first_name"))
                .lastName(resultSet.getString("last_name"))
                .build();
    }
}
