package structuralPatterns.bridge.one.withBridge;

import lombok.Builder;

@Builder
public class SecondaryMenuImpl implements SecondaryMenu {
    private OSController osController;

    @Override
    public void volumeUp() {
        osController.volumeUp();
    }

    @Override
    public void volumeDown() {
        osController.volumeDown();
    }
}
