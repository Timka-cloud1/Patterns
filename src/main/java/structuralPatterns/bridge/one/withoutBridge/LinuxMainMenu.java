package structuralPatterns.bridge.one.withoutBridge;

public class LinuxMainMenu implements MainMenu {
    @Override
    public void powerOff() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public SystemInfo systemInfo() {
        return null;
    }
}
