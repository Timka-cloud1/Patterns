package behaviourPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
                .clientType(ClientType.INDIVIDUAL)
                .name("Alex")
                .build();

        // теперь мы хотим чтобы этого клиента обработали менеджеры
        // как мы сделаем это БЕЗ паттерна chain of responsibility ->
//        ManagerUVxoda dima = new ManagerUVxoda(new Person("Dima"));
//        IndividualCreditManager ivan = new IndividualCreditManager(new Person("Ivan"));
//        IndividualIpotekaManager sveta = new IndividualIpotekaManager(new Person("Sveta"));
//        BusinessCreditManager mariya = new BusinessCreditManager(new Person("Mariya"));
//        dima.handle(client);
//        ivan.handle(client);
//        sveta.handle(client);
//        mariya.handle(client);


        // как мы сделаем это С паттером chain of responsibility ->
        ManagerUVxoda dima = new ManagerUVxoda(new Person("Dima"));
        IndividualCreditManager ivan = new IndividualCreditManager(new Person("Ivan"));
        IndividualIpotekaManager sveta = new IndividualIpotekaManager(new Person("Sveta"));
        BusinessCreditManager mariya = new BusinessCreditManager(new Person("Mariya"));
        NotGoodManager stepan = new NotGoodManager(new Person("Stepan")); // это взяточник с шансом 50 процентов что ему дадут деньги и он сам все решит
        stepan.setNext(dima);
        dima.setNext(ivan);
        ivan.setNext(sveta);
        sveta.setNext(mariya);
        Worker chain = stepan; // мы настроили цепочку и теперь через эту цепочку готовую обрабатываем клиентов
        chain.handle(client);
//        chain.handle(Client.builder()
//                .clientType(ClientType.BUSINESS)
//                .name("Ben")
//                .build());
//        chain.handle(Client.builder()
//                .clientType(ClientType.INDIVIDUAL)
//                .name("Tom")
//                .build());
    }
}
