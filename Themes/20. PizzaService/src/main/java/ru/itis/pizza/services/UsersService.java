package ru.itis.pizza.services;

import ru.itis.pizza.forms.LoginForm;
import ru.itis.pizza.forms.UserForm;
import ru.itis.pizza.models.User;
import ru.itis.pizza.transfer.UserDto;

import java.util.List;

/**
 * 03.09.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersService {
    void register(UserForm userForm);
    boolean isRegistered(User user);
    List<UserDto> getAllUsers();

    void login(LoginForm loginForm);
}
