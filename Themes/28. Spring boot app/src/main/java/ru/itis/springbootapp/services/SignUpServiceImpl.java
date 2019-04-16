package ru.itis.springbootapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.springbootapp.forms.SignUpForm;
import ru.itis.springbootapp.models.User;
import ru.itis.springbootapp.models.UserState;
import ru.itis.springbootapp.repositories.UsersRepository;

import java.util.UUID;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmailService emailService;

    @Override
    public void signUp(SignUpForm form) {
        String confirmString = UUID.randomUUID().toString();

        User user = User.builder()
                .passwordHash(passwordEncoder.encode(form.getPassword()))
                .email(form.getEmail())
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .state(UserState.NOT_CONFIRMED)
                .confirmString(confirmString)
                .build();

        usersRepository.save(user);
        String text = "<a href='http://localhost:8080/confirm/" + user.getConfirmString() + "'>" +"Пройдите по ссылке" + "</a>";
        System.out.println(text);
        emailService.sendMail("Подтвреждение регистрации", text, user.getEmail());
    }
}
