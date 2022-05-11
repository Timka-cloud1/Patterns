package creationalPatterns.one.builder;

public interface Builder {
    Message build();
    Builder sender(String sender);
    Builder receiver(String receiver);
    Builder subject(String subject);
    Builder body(String body);
}
