package combined.email.business.api;

public class EmailDto {
    private String to;
    private String subject;

    public EmailDto(String to, String subject) {
        this.to = to;
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }
}
