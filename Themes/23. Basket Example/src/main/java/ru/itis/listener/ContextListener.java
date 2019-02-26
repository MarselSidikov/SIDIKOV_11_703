package ru.itis.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 14.02.2019
 * ContextListener
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
//@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // подключим контекст Spring
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ru.itis\\context.xml");
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("context", applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
