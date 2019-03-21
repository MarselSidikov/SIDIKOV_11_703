package ru.itis.springbootapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springbootapp.models.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAllByName(String name);
}
