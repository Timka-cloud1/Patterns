package structuralPatterns.bridge.one.withBridge;

import lombok.Builder;

@Builder
public class MainMenuImpl implements MainMenu {
    private OSController osController;

    @Override
    public void powerOff() {
        osController.powerOff();
    }

    @Override
    public void volumeUp() {
        osController.volumeUp();
    }

    @Override
    public void volumeDown() {
        osController.volumeDown();
    }

    @Override
    public SystemInfo systemInfo() {
        return osController.systemInfo();
    }
}
