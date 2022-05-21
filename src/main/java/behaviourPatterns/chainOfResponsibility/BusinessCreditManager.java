package behaviourPatterns.chainOfResponsibility;

public class BusinessCreditManager extends AbstractWorker {
    public BusinessCreditManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        if(client.getClientType() == ClientType.BUSINESS) {
            System.out.printf("I'm %s, give credit to %s\n", person.getName(), client.getName());

        }
        super.handle(client);
    }


}
