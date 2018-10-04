package ru.itis.pizza.mapper;

import java.sql.ResultSet;

/**
 * 04.10.2018
 * RowMapper
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface RowMapper<T> {
    T mapRow(ResultSet row);
}
