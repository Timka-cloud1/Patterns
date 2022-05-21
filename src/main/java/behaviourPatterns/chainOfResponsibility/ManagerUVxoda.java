package behaviourPatterns.chainOfResponsibility;

public class ManagerUVxoda extends AbstractWorker {

    public ManagerUVxoda(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        System.out.printf("Hi, I'm  %s, can I help you, %s?\n", person.getName(), client.getName());


        super.handle(client);
    }
}
