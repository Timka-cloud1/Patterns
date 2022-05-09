package prototype;

import lombok.*;

@AllArgsConstructor
@Builder // Builder тут чисто для удобства, он не имеет отношение к prototype
@Getter
@ToString
@EqualsAndHashCode
public class User implements Cloneable, Prototype<User>{
    private  int id;
    private final String username;
    private final String email;
    private final String password;
    // ready to use builder

    @Override
    public User clone() throws CloneNotSupportedException {
//        super.clone();
//        return new User(this.id, this.username, this.email, this.password);

        // or we can do
        return (User) super.clone(); // все тоже самое
    }


    @Override // мы сделали свой интерфейс Prototype, сделали свою логику clone, так тоже можно и все будет работать одинаково
    public User copy() {
        return new User(this.id, this.username, this.email, this.password);
    }
}
