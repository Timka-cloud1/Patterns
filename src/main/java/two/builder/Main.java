package two.builder;

public class Main {
    public static void main(String[] args) {
        final User user = User.builder().firstname("A").lastname("B").build();
        final User user1 = User.builder().firstname("asd").lastname("fds").build();
        final User user2 = User.builder().firstname("ruyty").lastname("dfh").build();
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
    }
}
