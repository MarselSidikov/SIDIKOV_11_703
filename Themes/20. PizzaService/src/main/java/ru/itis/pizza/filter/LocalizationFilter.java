package ru.itis.pizza.filter;

import ru.itis.pizza.localization.Localization;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 15.10.2018
 * LocalizationFilter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@WebFilter("*")
public class LocalizationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        if (httpRequest.getRequestURI().toString().equals("/signUp")) {
            if (request.getParameter("lan") == null) {
                Cookie cookies[] = httpRequest.getCookies();
                boolean isFound = false;
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("lan") && cookie.getValue().equals("EN")) {
                        httpRequest.setAttribute("localization", Localization.SIGN_UP_ENG);
                        isFound = true;
                    } else if (cookie.getName().equals("lan") && cookie.getValue().equals("RU")) {
                        httpRequest.setAttribute("localization", Localization.SIGN_UP_RU);
                        isFound = true;
                    }
                }
                if (!isFound) {
                    httpRequest.setAttribute("localization", Localization.SIGN_UP_ENG);
                }
            } else if (request.getParameter("lan").equals("RU")) {
                Cookie cookie = new Cookie("lan", "RU");
                cookie.setMaxAge(60 * 60 * 3);
                httpResponse.addCookie(cookie);
                request.setAttribute("localization", Localization.SIGN_UP_RU);
            } else if (request.getParameter("lan").equals("EN")) {
                request.setAttribute("localization", Localization.SIGN_UP_ENG);
                Cookie cookie = new Cookie("lan", "EN");
                cookie.setMaxAge(60 * 60 * 3);
                httpResponse.addCookie(cookie);
            }
        }
        chain.doFilter(httpRequest, httpResponse);
    }

    @Override
    public void destroy() {

    }
}
