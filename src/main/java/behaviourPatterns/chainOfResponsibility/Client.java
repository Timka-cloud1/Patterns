package behaviourPatterns.chainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
public class Client {
    private final ClientType clientType;
    private final String name;
}
