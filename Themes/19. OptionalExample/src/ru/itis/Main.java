package ru.itis;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepositoryImpl();

        Optional<User> optionalUser =   usersRepository.findOne(4L);

        optionalUser.ifPresent(User::sayHello);
    }
}
