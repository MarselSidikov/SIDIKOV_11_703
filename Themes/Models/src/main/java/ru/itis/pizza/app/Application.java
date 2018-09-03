package ru.itis.pizza.app;

import ru.itis.pizza.models.User;

/**
 * 03.09.2018
 * Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Application {
    public static void main(String[] args) {
        User user = User.builder()
                .email("sidikov.marsel@gmail.com")
                .firstName("Marsel")
                .lastName("Sidikov")
                .password("qwerty007")
                .build();

        System.out.println(user);
    }
}
