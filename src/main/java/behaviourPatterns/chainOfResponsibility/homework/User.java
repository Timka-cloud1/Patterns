package behaviourPatterns.chainOfResponsibility.homework;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class User {
    private String email;
    private String password;
    private String role;
}
