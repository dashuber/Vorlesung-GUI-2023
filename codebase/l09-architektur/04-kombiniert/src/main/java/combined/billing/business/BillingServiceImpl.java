package combined.billing.business;


import combined.email.business.api.EmailDto;
import combined.email.business.api.EmailService;
import combined.email.business.EmailServiceFactory;

public class BillingServiceImpl {

    private EmailService emailService = EmailServiceFactory.get();

    public void foo() {
        //send email
        //emailService.sendEmail(new EmailDto("bla@blub.com", "job done"));

        emailService.sendEmail(new EmailDto("bla@blub.com", "did it!"));
    }
}
