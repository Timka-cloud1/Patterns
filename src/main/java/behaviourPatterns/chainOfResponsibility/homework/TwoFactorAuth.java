package behaviourPatterns.chainOfResponsibility.homework;

public class TwoFactorAuth extends AbstractValidator{
    private Server server;

    public TwoFactorAuth(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password, String specialKey, String role) {
        if(!server.generateSpecialKey().equals(specialKey)) {
            System.out.println("special key is NOT valid");
            return false;
        }
        return super.check(email, password, specialKey, role);
    }
}
