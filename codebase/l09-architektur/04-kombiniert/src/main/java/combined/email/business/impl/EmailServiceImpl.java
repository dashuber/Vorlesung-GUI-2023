package combined.email.business.impl;

import combined.email.business.api.EmailDto;
import combined.email.business.api.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(EmailDto email) {
        System.out.println("send email " + email);
    }
}
