package builder;

public class SmsMessage implements Message {
    private final String subject;
    private final String body;
    private final String sender;
    private final String receiver;

    public SmsMessage(String subject, String body, String sender, String receiver) {
        this.subject = subject;
        this.body = body;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public String getSender() {
        return sender;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "SmsMessage{" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
