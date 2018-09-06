package ru.itis;

import java.util.Optional;

/**
 * 06.09.2018
 * UsersRepositoryImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersRepositoryImpl implements UsersRepository {
    @Override
    public Optional<User> findOne(Long id) {
        User user = null;
        if (id.equals(3L)) {
            user = new User();
        }
        return Optional.ofNullable(user);
    }
}
