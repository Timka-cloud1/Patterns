package behaviourPatterns.chainOfResponsibility.homework;

public class AbstractValidator implements Validator{
    private Validator next;

    @Override
    public boolean check(String email, String password, String specialKey,String role) {
        if(next != null) {
            next.check(email,password, specialKey,role);
            return true;
        }
        return false;
    }

    @Override
    public void setNext(Validator validator) {
        next = validator;
    }
}
