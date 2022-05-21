package behaviourPatterns.chainOfResponsibility;

public class NotGoodManager extends AbstractWorker{
    public NotGoodManager(Person person) {
        super(person);

    }

    @Override
    public void handle(Client client) {
        if(Math.random() > 0.5) {
            System.out.printf("I'm %s,I do all needs by myself for %s\n",person.getName(), client.getName());
        } else {
            super.handle(client);
        }
    }
}
