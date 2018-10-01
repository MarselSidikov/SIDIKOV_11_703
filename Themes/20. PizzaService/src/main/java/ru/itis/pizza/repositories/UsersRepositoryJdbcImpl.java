package ru.itis.pizza.repositories;

import lombok.SneakyThrows;
import ru.itis.pizza.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    //language=SQL
    private static final String SQL_INSERT_USER =
            "insert into pizza_user(email, hash_password, first_name, last_name) values (?, ?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_BY_EMAIL =
            "select * from pizza_user where email = ?;";

    public UsersRepositoryJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    @SneakyThrows
    public User findOneByEmail(String email) {
        PreparedStatement statement = connection.prepareStatement(SQL_SELECT_BY_EMAIL);
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();

        return User.builder()
                .id(resultSet.getLong("id"))
                .firstName(resultSet.getString("first_name"))
                .lastName(resultSet.getString("last_name"))
                .hashPassword(resultSet.getString("hash_password"))
                .email(resultSet.getString("email"))
                .build();
    }

    @Override
    @SneakyThrows
    public void save(User model) {
        PreparedStatement statement = connection.prepareStatement(SQL_INSERT_USER);
        statement.setString(1, model.getEmail());
        statement.setString(2, model.getHashPassword());
        statement.setString(3, model.getFirstName());
        statement.setString(4, model.getLastName());
        int affectedRows = statement.executeUpdate();
        if (affectedRows == 0) {
            throw new IllegalArgumentException("Can't save user");
        }
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
