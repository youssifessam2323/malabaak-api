package io.joework.malabaakapi.service;

import jakarta.mail.MessagingException;

public interface MailService {
    void send(String to, String subject, String body, boolean isHtml) throws MessagingException;
}