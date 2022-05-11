package creationalPatterns.one.builder;

public class EmailBuilder implements Builder{

    private String sender;
    private String receiver;
    private String subject;
    private String body;

    @Override
    public Message build() {
        return new EmailMessage(subject, body, sender,receiver);
    }

    @Override
    public Builder sender(String sender) {
        this.sender = sender;
        return this;
    }

    @Override
    public Builder receiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    @Override
    public Builder subject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public Builder body(String body) {
        this.body = body;
        return this;
    }
}
