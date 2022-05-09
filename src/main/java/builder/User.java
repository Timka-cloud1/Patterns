package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@Builder(toBuilder = true) // toBuilder = true можно менять поля у существуещего но возвращает он новый юзера
@ToString
public class User {
    private  int id;
    private final String username;
    private final String email;
    private final String password;
    // ready to use builder



}
