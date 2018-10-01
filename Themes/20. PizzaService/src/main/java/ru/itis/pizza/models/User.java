package ru.itis.pizza.models;

import lombok.*;

import java.util.List;
import java.util.Objects;

/**
 * 03.09.2018
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String email;
    private String hashPassword;

    private String firstName;
    private String lastName;
    private String address;

    private List<Order> orders;
}
