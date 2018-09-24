package ru.itis.demo.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 24.09.2018
 * DemoServlet
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class DemoServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) {
        PrintWriter writer = null;
        try {
            response.setHeader("Content-Type", "text/html");
            writer = response.getWriter();
            writer.write("<form method='post'>" +
                    "  Login:<br>" +
                    "  <input type='text' name='login' placeholder='Login'><br>" +
                    "  Password:<br>" +
                    "  <input type='password' name='password' placeholder='Password'><br><br>" +
                    "  <input type='submit' value='Login'>" +
                    "</form>");
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        response.setHeader("Content-Type", "text/html");
        writer.write("<h4>Hello, " + login + "</h4>");
        writer.write("<h4>Your password is </h4>");
        writer.write("<h1 style='color:red'>" + password + "</h1>");

    }
}
