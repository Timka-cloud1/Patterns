package behaviourPatterns.chainOfResponsibility;

import lombok.AllArgsConstructor;


public class IndividualCreditManager extends AbstractWorker {


    public IndividualCreditManager(Person person) {
        super(person);
    }

    @Override
    public void handle(Client client) {
        if(client.getClientType() == ClientType.INDIVIDUAL) {
            System.out.printf("I'm %s, give credit to %s\n", person.getName(), client.getName());

        }
        super.handle(client);
    }


}
