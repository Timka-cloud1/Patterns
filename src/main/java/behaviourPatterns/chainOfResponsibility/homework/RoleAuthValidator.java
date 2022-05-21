package behaviourPatterns.chainOfResponsibility.homework;

public class RoleAuthValidator extends AbstractValidator{
    private Server server;

    public RoleAuthValidator(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password, String specialKey, String role) {
        if(server.isAdmin(role)) {
            System.out.println("Welcome admin");
            return true;
        }
        System.out.println("Welcome user");
        return super.check(email, password, specialKey, role);
    }
}
