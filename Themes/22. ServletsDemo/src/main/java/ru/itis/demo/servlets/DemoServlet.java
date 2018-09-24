package ru.itis.demo.servlets;

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
            writer.write("<form>" +
                    "  First name:<br>" +
                    "  <input type='text' name='firstname' value='Mickey'><br>" +
                    "  Last name:<br>" +
                    "  <input type='text' name='lastname' value='Mouse'><br><br>" +
                    "  <input type='submit' value='Submit'>" +
                    "</form>");
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
