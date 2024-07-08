package com.uber.email_service.core;

public interface EmailSenderUseCase {
    void sendEmail(String toEmail, String subject, String body);
}