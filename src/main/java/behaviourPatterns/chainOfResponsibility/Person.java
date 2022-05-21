package behaviourPatterns.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class Person {
    private final String name;
}
