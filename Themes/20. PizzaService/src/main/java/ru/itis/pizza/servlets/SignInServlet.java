package ru.itis.pizza.servlets;

import lombok.SneakyThrows;
import ru.itis.pizza.forms.LoginForm;
import ru.itis.pizza.repositories.UsersRepository;
import ru.itis.pizza.repositories.UsersRepositoryJdbcImpl;
import ru.itis.pizza.services.UsersService;
import ru.itis.pizza.services.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 01.10.2018
 * SignInServlet
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {
    private static final String URL = "jdbc:postgresql://localhost:5432/pizza_db_11_703";
    private static final String USER = "postgres";
    private static final String PASSWORD = "qwerty007";


    private UsersService service;

    @Override
    @SneakyThrows
    public void init() throws ServletException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        UsersRepository usersRepository = new UsersRepositoryJdbcImpl(connection);
        service = new UsersServiceImpl(usersRepository);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setHeader("Content-Type", "text/html");
        writer.write("<form method='post'>" +
                "  Email:<br>" +
                "  <input type='text' name='email' placeholder='email'><br>" +
                "  Password:<br>" +
                "  <input type='password' name='password' placeholder='Password'><br><br>" +
                "  <input type='submit' value='Sign In'>" +
                "</form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String rawPassword = request.getParameter("password");
        LoginForm loginForm = LoginForm.builder()
                .email(email)
                .password(rawPassword)
                .build();

        service.login(loginForm);
        PrintWriter writer = response.getWriter();
        writer.write("All okey");
    }
}
