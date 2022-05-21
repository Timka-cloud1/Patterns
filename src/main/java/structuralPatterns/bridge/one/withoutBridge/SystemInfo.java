package structuralPatterns.bridge.one.withoutBridge;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SystemInfo {
    private final SystemType systemType;
    private int cpu;
    private int memory;
}
