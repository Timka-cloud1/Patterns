package builder;

public class MainBuilder {
    public static void main(String[] args) {
        Builder builder = new SmsBuilder();
        Message message = builder
                .sender("Timka")
                .receiver("Anton")
                .subject("Tennis")
                .body("Are you going?")
                .build();
        System.out.println(message);

        Message message2 = new EmailBuilder().sender("Lina").receiver("Invoker").subject("mid").body("You've played well").build();
        System.out.println(message2);


        User user = User.builder().id(1).email("aasa").password(":adasd").username("asddas").build();
        User updatedUser = user.toBuilder().username("ssss").build();
        System.out.println(updatedUser);
        System.out.println(user);
    }
}
