package ru.itis.services;

import ru.itis.forms.SignInForm;
import ru.itis.forms.SignUpForm;
import ru.itis.models.User;

import java.util.List;

/**
 * 25.10.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersService {
    void signUp(SignUpForm form);

    String signIn(SignInForm form);

    boolean isExistByCookie(String cookieValue);

    List<User> getAllUsers();
}