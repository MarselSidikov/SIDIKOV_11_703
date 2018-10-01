package ru.itis.pizza.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 01.10.2018
 * LoginForm
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class LoginForm {
    private String email;
    private String password;
}
