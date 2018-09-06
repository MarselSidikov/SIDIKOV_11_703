package ru.itis;

import java.util.Optional;

/**
 * 06.09.2018
 * UsersRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository {
    Optional<User> findOne(Long id);
}
