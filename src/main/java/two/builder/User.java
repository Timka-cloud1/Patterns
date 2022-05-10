package two.builder;

import one.builder.Builder;

public class User {
    private String firstname;
    private String lastname;

    private User() {

    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public static class Builder { // Так более предпочительнее чем делать через интерфейс, нет раздутие кода.
        private final User user = new User();

        private Builder() {
        }

        public Builder firstname(String firstname) {
            user.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            user.lastname = lastname;
            return this;
        }

        public User build() {
            return user;
        }
    }
}
