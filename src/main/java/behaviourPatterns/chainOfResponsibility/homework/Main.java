package behaviourPatterns.chainOfResponsibility.homework;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        User admin = new User("admin@mail.ru", "111", "admin");
        User user = new User("user@mail.ru", "444", "user");
        server.addUser(admin);
        server.addUser(user);

        AuthenticationValidator authenticationValidator = new AuthenticationValidator(server);
        TwoFactorAuth twoFactorAuth = new TwoFactorAuth(server);
        RoleAuthValidator roleAuthValidator = new RoleAuthValidator(server);
        authenticationValidator.setNext(twoFactorAuth);
        twoFactorAuth.setNext(roleAuthValidator);
        Validator validator = authenticationValidator;
        String key1 = server.generateSpecialKey();
        validator.check(admin.getEmail(), admin.getPassword(), key1, admin.getRole());
        validator.check(user.getEmail(), user.getPassword(), key1, user.getRole());
        validator.check(user.getEmail(), "567657567", key1, user.getRole());


    }
}
