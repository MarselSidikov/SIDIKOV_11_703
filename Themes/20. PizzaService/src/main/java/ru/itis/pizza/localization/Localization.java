package ru.itis.pizza.localization;

import sun.java2d.SunGraphics2D;

import java.util.HashMap;
import java.util.Map;

/**
 * 15.10.2018
 * Localization
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Localization {
    public static final Map<String, String> SIGN_UP_ENG;
    public static final Map<String, String> SIGN_UP_RU;

    static {
        SIGN_UP_ENG = new HashMap<>();
        SIGN_UP_ENG.put("signup.email", "Email");
        SIGN_UP_ENG.put("signup.password", "Password");
        SIGN_UP_ENG.put("signup.firstname", "First Name");
        SIGN_UP_ENG.put("signup.lastname", "Last Name");
        SIGN_UP_ENG.put("signup.signup", "Sign Up");

        SIGN_UP_RU = new HashMap<>();
        SIGN_UP_RU.put("signup.email", "Мыло");
        SIGN_UP_RU.put("signup.password", "Пароль");
        SIGN_UP_RU.put("signup.firstname", "Имя");
        SIGN_UP_RU.put("signup.lastname", "Фамилия");
        SIGN_UP_RU.put("signup.signup", "Зарегистрироваться");

    }
}
