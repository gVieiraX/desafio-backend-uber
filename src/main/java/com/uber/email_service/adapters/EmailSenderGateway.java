package com.uber.email_service.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}