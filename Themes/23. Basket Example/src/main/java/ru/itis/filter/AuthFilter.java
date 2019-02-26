package ru.itis.filter;

import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.repositories.AuthRepository;
import ru.itis.repositories.AuthRepositoryImpl;
import ru.itis.repositories.UsersRepository;
import ru.itis.repositories.UsersRepositoryJdbcTemplateImpl;
import ru.itis.services.UsersService;
import ru.itis.services.UsersServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;

/**
 * 25.10.2018
 * AuthFilter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
// данный фильтр обрабатывает все запросы, которые приходят на url - /shop
//@WebFilter("/shop")
public class AuthFilter implements Filter {

    private UsersService usersService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ApplicationContext context = (ApplicationContext) filterConfig.getServletContext().getAttribute("context");
        usersService = context.getBean(UsersService.class);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        // получаем объекты запроса и ответа
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        // вытаскиваем из запроса все куки
        Cookie cookies[] = request.getCookies();
        // если куки действительно есть
        if (cookies != null) {
            // идем по всем кукам
            for (Cookie cookie : cookies) {
                // если мы нашли куку, которая называется auth
                if (cookie.getName().equals("auth")) {
                    // при этом данная кука есть в базе
                    if (usersService.isExistByCookie(cookie.getValue())) {
                        // если кука есть в базе - мы пропускаем человека дальше
                        chain.doFilter(request, response);
                    }
                }
            }
            // если куки не было вообще, или не было такой куки в базе
            // перебрасываем пользователя на регистрацию
            response.sendRedirect("/signIn");
            // останавливаем обработку запроса
            return;
        }
        response.sendRedirect("/signIn");
        return;
    }

    @Override
    public void destroy() {

    }
}
