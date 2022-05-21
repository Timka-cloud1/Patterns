package behaviourPatterns.chainOfResponsibility;

public class IndividualIpotekaManager extends AbstractWorker {
    public IndividualIpotekaManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        if(client.getClientType() == ClientType.INDIVIDUAL) {
            System.out.printf("I'm %s, give ipoteka to %s\n", person.getName(), client.getName());

        }
        super.handle(client);
    }


}
