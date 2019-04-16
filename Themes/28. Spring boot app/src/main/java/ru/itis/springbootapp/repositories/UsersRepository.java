package ru.itis.springbootapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springbootapp.models.User;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
    Optional<User> findOneByConfirmString(String confirmString);
}
