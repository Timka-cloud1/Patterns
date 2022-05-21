package behaviourPatterns.chainOfResponsibility.homework;

public interface Validator {
    boolean check(String email, String password, String specialKey, String role);
    void setNext(Validator validator);
}
