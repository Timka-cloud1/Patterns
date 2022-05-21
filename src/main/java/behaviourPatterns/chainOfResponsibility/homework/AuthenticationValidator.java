package behaviourPatterns.chainOfResponsibility.homework;

public class AuthenticationValidator extends AbstractValidator{
    private Server server;

    public AuthenticationValidator(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password, String specialKey, String role) {
        if(!server.hasEmail(email)) {
            System.out.println("Email not found");
            return false;
        }
        if(!server.isValidPassword(password)){
            System.out.println("Password is not valid");
            return false;
        }
        return super.check(email, password, specialKey, role);
    }
}
