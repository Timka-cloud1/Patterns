package creationalPatterns.one.prototype;


public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = User.builder().id(1).email("aasa").password(":adasd").username("asddas").build();
        System.out.println(user);
        User copy = user.clone();
        User copy2 = user.copy();
        System.out.println(copy2);
        System.out.println(copy);
        System.out.println(copy.equals(copy2));
    }
}
