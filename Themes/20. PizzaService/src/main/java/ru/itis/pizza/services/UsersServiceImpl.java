package ru.itis.pizza.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.pizza.forms.LoginForm;
import ru.itis.pizza.forms.UserForm;
import ru.itis.pizza.models.User;
import ru.itis.pizza.repositories.UsersRepository;
import ru.itis.pizza.transfer.UserDto;

import java.util.List;

import static ru.itis.pizza.transfer.UserDto.from;

/**
 * 03.09.2018
 * UsersServiceImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    private PasswordEncoder passwordEncoder;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public void register(UserForm userForm) {
        User user = User.builder()
                .email(userForm.getEmail())
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .hashPassword(passwordEncoder.encode(userForm.getPassword()))
                .build();
        usersRepository.save(user);
    }

    @Override
    public boolean isRegistered(User user) {
        return false;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = usersRepository.findAll();
        return from(users);
    }

    @Override
    public void login(LoginForm loginForm) {
        User user = usersRepository.findOneByEmail(loginForm.getEmail());
        if (!passwordEncoder.matches(loginForm.getPassword(), user.getHashPassword())) {
             throw new IllegalArgumentException("Wrong password or email");
        }
    }
}
