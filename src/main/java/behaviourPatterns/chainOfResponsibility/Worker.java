package behaviourPatterns.chainOfResponsibility;

public interface Worker {
    void handle(Client client);
    void setNext(Worker worker);
}
