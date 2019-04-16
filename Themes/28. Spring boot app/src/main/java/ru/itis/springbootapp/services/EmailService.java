package ru.itis.springbootapp.services;

/**
 * 02.08.2017
 *
 * @author Marsel Sidikov (First Software Engineering Platform)
 * @version 1.0
 */
public interface EmailService {
    void sendMail(String subject, String text, String email);
}
