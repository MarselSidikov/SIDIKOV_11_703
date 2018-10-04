package ru.itis.pizza.repositories;

import java.util.List;

/**
 * 03.09.2018
 * CrudRepository
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CrudRepository<T> {
    void save(T model);
    T find(Long id);
    List<T> findAll();
}
