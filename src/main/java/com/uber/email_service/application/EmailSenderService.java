package com.uber.email_service.application;

import com.uber.email_service.adapters.EmailSenderGateway;
import com.uber.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String toEmail, String subject, String body) {
        emailSenderGateway.sendEmail(toEmail, subject, body);
    }
}